package com.middleaware.dubbo.server.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 */
public class BootstrapCluster1 {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext
                        ("dubbo/dubbo-cluster1.xml");
        context.start();

        System.in.read(); //阻塞当前进程
    }
}
