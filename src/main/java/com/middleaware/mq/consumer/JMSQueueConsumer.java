package com.middleaware.mq.consumer;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 */
public class JMSQueueConsumer {

    public static void main(String[] args) {
        ConnectionFactory connectionFactory=
                new ActiveMQConnectionFactory
                        ("tcp://127.0.0.1:61616");
        Connection connection=null;
        try {

            connection=connectionFactory.createConnection();
            connection.start();

            Session session=connection.createSession
                    (Boolean.FALSE,Session.DUPS_OK_ACKNOWLEDGE); //延迟确认:很可能会重复接受到消息。好处是，等我空闲了我再去确认。
            //创建目的地
            Destination destination=session.createQueue("myQueue");
            //创建发送者
            MessageConsumer consumer=session.createConsumer(destination);
            for(int i=0;i<10;i++) {
                //这里是一个阻塞的过程：直到有消息了就消费消息。
                TextMessage textMessage = (TextMessage) consumer.receive();

                System.out.println(textMessage.getText());
                if(i==10) {
                    textMessage.acknowledge();
                }
            }
//          session.commit();//表示消息被自动确认
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
