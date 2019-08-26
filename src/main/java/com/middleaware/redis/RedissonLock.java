package com.middleaware.redis;


import org.redisson.Redisson;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

import java.util.concurrent.TimeUnit;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 */
public class RedissonLock {

    public static void main(String[] args) {
        Config config=new Config();
        config.useSingleServer().setAddress("redis://127.0.0.1:7001");
        RedissonClient redissonClient=Redisson.create(config);
        RLock rLock=redissonClient.getLock("updateOrder");
        try {
            rLock.tryLock(100,10,TimeUnit.SECONDS);
            System.out.println("获取锁成功");
            Thread.sleep(1000);
            rLock.unlock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
//            必须要释放锁和关闭客户端
            rLock.unlock();
            redissonClient.shutdown();
        }
    }
}
