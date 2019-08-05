package com.middleaware.dubbo.client;

import com.middleaware.dubbo.server.api.IGpHello;

public class TestMock implements IGpHello {
    @Override
    public String sayHello(String msg) {
        return "mock";
    }

    @Override
    public String rating(Double serviceAmount, Double rate) {
        return null;
    }
}
