package com.middleaware.rmi.server.rpc;

import com.middleaware.rmi.server.rpc.zk.RegisterCenter;
import com.middleaware.rmi.server.rpc.zk.RegisterCenterImpl;

import java.io.IOException;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 */
public class LServerDemoB2 {
    public static void main(String[] args) throws IOException {
        IGpHello iGpHello2=new GpHelloImpl2();
        RegisterCenter registerCenter = new RegisterCenterImpl();

        RpcServer rpcServer=new RpcServer(registerCenter,"127.0.0.1:8082");
        rpcServer.bind(iGpHello2);
        rpcServer.publisher();
        System.in.read();
    }
}
