package com.middleaware.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Pipeline;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 */
public class PipelineDemo {

    public static void main(String[] args) {
        Jedis jedis=new Jedis("127.0.0.1",7001);
        Pipeline pipeline=jedis.pipelined();
        for(int i=0;i<1000;i++){
            pipeline.incr("test");
        }
        pipeline.sync();

    }
}
