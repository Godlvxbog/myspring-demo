package com.middleaware.mq.producer;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 */
public class JMSQueueProducer {

    public static void main(String[] args) {
        //创建一个连接工厂：接口是jms，实现是activeMq
        ConnectionFactory connectionFactory=
                new ActiveMQConnectionFactory
                        ("tcp://127.0.0.1:61616");
        Connection connection=null;
        try {
            //创建一个连接
            connection=connectionFactory.createConnection();
            connection.start();

            //创建一个会话
            Session session=connection.createSession(Boolean.TRUE,Session.AUTO_ACKNOWLEDGE);
            //创建目的地
            Destination destination=session.createQueue("myQueue");
            //创建发送者
            MessageProducer producer=session.createProducer(destination);
            //设置持久化：储存在磁盘的。
            producer.setDeliveryMode(DeliveryMode.PERSISTENT);

            for(int i=0;i<10;i++) {
                //创建需要发送的消息
                TextMessage message = session.createTextMessage("Hello World:"+i);
                //Text   Map  Bytes  Stream  Object
                producer.send(message);
            }

            session.commit();
            session.close();
        } catch (JMSException e) {
            e.printStackTrace();
        }finally {
            if(connection!=null){
                try {
                    connection.close();
                } catch (JMSException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
