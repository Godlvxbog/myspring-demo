package com.middleaware.rmi.server.rpc;

import com.middleaware.rmi.server.rpc.anno.RpcAnnotation;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 *
 */

//@RpcAnnotation(value = IGpHello.class,version ="2.0" )
@RpcAnnotation(value = IGpHello.class )
public class GpHelloImpl2 implements IGpHello{
    @Override
    public String sayHello(String msg) {
        return "Hello , "+msg;
    }

    @Override
    public String rating(Double serviceAmount, Double rate) {
        return String.valueOf("8082的node 2.0的计价： billAmount = " +serviceAmount * rate);
    }

}
