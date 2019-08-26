package com.middleaware.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

import java.util.UUID;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 */
public class DistributedLock {

    //获得锁

    /**
     *
     * @param lockName  锁的名词
     * @param acquireTimeout  获得锁的超时时间：客户端，如果2s还不能拿到锁就返回客户端的
     * @param lockTimeout 锁本身的过期时间：超时就释放了。
     * @return
     */
    public String acquireLock(String lockName,long acquireTimeout,long lockTimeout){
        String identifier=UUID.randomUUID().toString();//保证释放锁的时候是同一个持有锁的人
        String lockKey="lock:"+lockName;
        int lockExpire=(int)(lockTimeout/1000);
        Jedis jedis=null;
        try {
            jedis = JedisConnectionUtils.getJedis();
            //超过2s就不去获取锁了。
            long end = System.currentTimeMillis() + acquireTimeout;
            //获取锁的限定时间
            while (System.currentTimeMillis() < end) {
                if (jedis.setnx(lockKey, identifier) == 1) { //设置值成功
                    jedis.expire(lockKey, lockExpire); //设置超时时间
                    return identifier; //获得锁成功
                }
                //健壮性的考虑，如果没有设置超时时间，需要去设置超时时间。
                if (jedis.ttl(lockKey) == -1) {
                    jedis.expire(lockKey, lockExpire); //设置超时时间
                }
                //说明这里没有获取到锁。
                try {
                    //等待片刻后进行获取锁的重试
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }finally {
            jedis.close(); //回收
        }
        return null;
    }

    public boolean releaseLockWithLua(String lockName,String identifier){
        System.out.println(lockName+"开始释放锁："+identifier);

        Jedis jedis=JedisConnectionUtils.getJedis();
        String lockKey="lock:"+lockName;

        //实现原子性的。必须保证，删除时不会被更改
        String lua="if redis.call(\"get\",KEYS[1])==ARGV[1] then " +
                "return redis.call(\"del\",KEYS[1]) " +
                "else return 0 end";
        Long rs=(Long) jedis.eval(lua,1,new String[]{lockKey,identifier});
        if(rs.intValue()>0){
            return true;
        }
        return false;

    }

    //释放锁
    public boolean releaseLock(String lockName,String identifier){
        System.out.println(lockName+"开始释放锁："+identifier);

        String lockKey="lock:"+lockName;
        Jedis jedis=null;
        boolean isRelease=false;
        try{
            jedis=JedisConnectionUtils.getJedis();
            while(true){
                //监控这个key：和事务做结合的。
                jedis.watch(lockKey);
                //判断是否为同一把锁
                if(identifier.equals(jedis.get(lockKey))){
                    //开启事务。
                    Transaction transaction=jedis.multi();
                    transaction.del(lockKey);
                    if(transaction.exec().isEmpty()){
                        continue;
                    }
                    isRelease=true;
                }
                //TODO 异常
//                其他地方不能去释放锁的。
                jedis.unwatch();
                break;
            }
        }finally {
            jedis.close();
        }
        return  isRelease;
    }

}
