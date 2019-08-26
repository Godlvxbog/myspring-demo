package com.middleaware.redis;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisSentinelPool;

import java.util.HashSet;
import java.util.Set;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 */
public class JedisClientDemo {

    public static void main(String[] args) {
        //sentinel
//        HostAndPort hostAndPort=new HostAndPort();
        //哨兵集群的地址:我连接的是哨兵集群的地址，而非哨兵集群的地址。可以从里面获取到被监控的集群节点
//        JedisSentinelPool jedisSentinelPool=new JedisSentinelPool();
        JedisPool jedisPool=null;
//        jedisPool.getResource().set
        Set<HostAndPort> hostAndPortSet=new HashSet<>();
        hostAndPortSet.add(new HostAndPort("127.0.0.1",7001));
//        hostAndPortSet.add(new HostAndPort("127.0.0.1",7002));
//        hostAndPortSet.add(new HostAndPort("127.0.0.1",7003));
//        hostAndPortSet.add(new HostAndPort("127.0.0.1",7003));

        JedisCluster jedisCluster=new JedisCluster(hostAndPortSet);
        jedisCluster.set("uid_1","rate=0.01");
        String rate =  jedisCluster.get("uid_1");
        System.out.println(rate);

    }
}
