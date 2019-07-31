package com.middleaware.rmi.client.rpc;

import com.middleaware.rmi.server.IHelloService;

import java.io.IOException;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 */
public class ClientDemo {

    public static void main(String[] args) throws IOException {
        RpcClientProxy rpcClientProxy=new RpcClientProxy();

        IHelloService hello= null;

        try {
            hello = rpcClientProxy.clientProxy
                    (IHelloService.class,"127.0.0.1",1099);
            System.out.println(hello.sayHello("mic"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
