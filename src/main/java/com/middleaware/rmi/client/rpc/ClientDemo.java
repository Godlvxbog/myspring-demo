package com.middleaware.rmi.client.rpc;

import com.middleaware.rmi.client.rpc.zk.IServiceDiscovery;
import com.middleaware.rmi.client.rpc.zk.ServiceDiscoveryImpl;
import com.middleaware.rmi.server.rpc.IGpHello;
import com.middleaware.rmi.server.rpc.zk.ZkConfig;

import java.io.IOException;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 */
public class ClientDemo {

    public static void main(String[] args) throws IOException {

        IServiceDiscovery serviceDiscovery =new ServiceDiscoveryImpl(ZkConfig.CONNNECTION_STR);
        RpcClientProxy rpcClientProxy=new RpcClientProxy(serviceDiscovery);

        IGpHello hello= null;

        try {
            hello = rpcClientProxy.clientProxy(IGpHello.class,"2.0");
            System.out.println(hello.rating(200.0,0.1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
