package com.middleaware.rmi.client.rpc;

import com.middleaware.rmi.server.rpc.IGpHello;

import java.io.IOException;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 */
public class ClientDemo {

    public static void main(String[] args) throws IOException {
        RpcClientProxy rpcClientProxy=new RpcClientProxy();

        IGpHello hello= null;

        try {
            hello = rpcClientProxy.clientProxy
                    (IGpHello.class,"127.0.0.1",8888);
            System.out.println(hello.rating(100.0,0.1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
