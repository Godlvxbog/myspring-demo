package com.middleaware.dubbo.server.provider;

import com.middleaware.dubbo.spi.DataBaseDriver;

import java.util.ServiceLoader;

public class DataBaseConection {
    public static void main(String[] args) {
        ServiceLoader<DataBaseDriver> serviceLoader =ServiceLoader.load(DataBaseDriver.class);
        for(DataBaseDriver driver: serviceLoader){
            System.out.println(driver.connect("localhost"));
        }



    }
}
