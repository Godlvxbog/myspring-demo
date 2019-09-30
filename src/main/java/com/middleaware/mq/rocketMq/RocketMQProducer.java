package com.middleaware.mq.rocketMq;

import com.alibaba.rocketmq.client.producer.DefaultMQProducer;
import com.alibaba.rocketmq.client.producer.SendResult;
import com.alibaba.rocketmq.common.message.Message;

import java.util.Date;

public class RocketMQProducer {


    public static void main(String[] args) throws Exception {
        DefaultMQProducer producer = new DefaultMQProducer("rmq-group");
        producer.setNamesrvAddr("127.0.0.1:9876");
        producer.setInstanceName("producer");
        producer.start();
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(5000); //每5秒发送一次MQ
                Message msg = new Message("TopicA-test", "TagA", (new Date() + " Hello RocketMQ ,QuickStart" + i).getBytes());
                SendResult sendResult = producer.send(msg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        producer.shutdown();
    }

    public void setInstanceName(String instanceName) {
        //this.instanceName = instanceName;
    }

    public void setRetryTimes(int retryTimes) {
        //this.retryTimes = retryTimes;
    }

}
