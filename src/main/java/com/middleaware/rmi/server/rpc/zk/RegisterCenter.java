package com.middleaware.rmi.server.rpc.zk;

public interface RegisterCenter {
    /**
     * 注册服务的名称和地址
     * @param serviceName
     * @param serviceAddress
     */
    void register(String serviceName,String serviceAddress);
}
