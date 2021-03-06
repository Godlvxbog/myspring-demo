package com.middleaware.dubbo.server.provider;

import com.middleaware.dubbo.server.api.IGpHello;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 */
public class GpHelloImpl implements IGpHello {

    @Override
    public String rating(Double serviceAmount, Double rate) {
        String res = Double.toString(serviceAmount * rate) ;
        return "billAmount = "+ res ;
    }

    @Override
    public String sayHello(String msg) {
        System.out.println("hello"+ msg);
        return "Hello:"+msg;
    }
}
