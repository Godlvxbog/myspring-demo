package com.middleaware.rmi.client.rpc;

import com.middleaware.rmi.server.IHelloService;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 */
public class ClientDemo {

    public static void main(String[] args) {
        RpcClientProxy rpcClientProxy=new RpcClientProxy();

        IHelloService hello= null;
        try {
            hello = rpcClientProxy.clientProxy
                    (IHelloService.class,"localhost",8888);
            System.out.println(hello.sayHello("mic"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
