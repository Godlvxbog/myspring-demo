package com.middleaware.rmi.client.rpc;

import com.middleaware.rmi.client.rpc.zk.IServiceDiscovery;
import com.middleaware.rmi.server.rpc.RpcRequest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 */
public class RemoteInvocationHandler implements InvocationHandler {

    private IServiceDiscovery serviceDiscovery;
    private String version;


    public RemoteInvocationHandler(IServiceDiscovery serviceDiscovery, String version) {
        this.serviceDiscovery = serviceDiscovery;
        this.version = version;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //组装请求
        RpcRequest request=new RpcRequest();
        request.setClassName(method.getDeclaringClass().getName());
        request.setMethodName(method.getName());
        request.setParameters(args);
        request.setVersion(version);
        //通过tcp传输协议进行传输


        String serviceAddr = serviceDiscovery.discover(request.getClassName());
        TCPTransport tcpTransport=new TCPTransport(serviceAddr);
        //发送请求
        return tcpTransport.send(request);
    }
}
