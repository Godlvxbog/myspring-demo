package com.middleaware.dubbo.client;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.rpc.Protocol;
import com.middleaware.dubbo.server.api.IGpHello;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 */
public class Bootstrap {

    public static void main(String[] args) throws IOException, InterruptedException {
        testDubbo();
        testSPi();
    }

    public static void testDubbo() throws IOException, InterruptedException {
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext
                        ("dubbo/dubbo-client.xml");
        IGpHello iGpHello = (IGpHello) context.getBean("gpHelloService");
//        String res = iGpHello.rating(100.0,0.02);
//        System.out.println(res);

        for (int i = 0; i < 10; i++) {
            String res2 = iGpHello.sayHello("xbog");
            System.out.println(res2);
        }

//        System.in.read();
    }


    public static void testSPi(){
        Protocol protocol = ExtensionLoader.getExtensionLoader(Protocol.class).getExtension("myProtocal");
        System.out.println(protocol.getDefaultPort());
    }
}
