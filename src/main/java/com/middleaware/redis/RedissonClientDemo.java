package com.middleaware.redis;


import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 */
public class RedissonClientDemo {
    public static void main(String[] args) {
        Config config=new Config();
        config.useClusterServers().
                addNodeAddress("redis://127.0.0.1:7001");
        RedissonClient redissonClient=Redisson.create(config);
//        redissonClient.getLock();//分布式锁
//        字符串用bucket
        redissonClient.getBucket("mic").set("value");

    }
}
