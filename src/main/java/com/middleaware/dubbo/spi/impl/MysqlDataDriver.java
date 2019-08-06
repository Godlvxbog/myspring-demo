package com.middleaware.dubbo.spi.impl;

import com.middleaware.dubbo.spi.DataBaseDriver;

/**
 * 外部厂商的实现，
 * 1、需要在pom中依赖规范
 */
public class MysqlDataDriver implements DataBaseDriver {
    @Override
    public String connect(String host) {
        return "create mysql connecting";
    }
}
