package com.xbog.framework.mybatis.xbogBatis.config;

//import lombok.Data;

import java.io.IOException;

/**
 * Created by James on 2017-07-01.
 * From 咕泡学院出品
 * 老师咨询 QQ 2904270631
 */
//@Data
public class GpConfiguration {

    private String scanPath;

    private MapperRegistory mapperRegistory = new MapperRegistory();

    public GpConfiguration scanPath(String scanPath) {
        this.scanPath = scanPath;
        return this;
    }

    public void build() throws IOException {
        if (null == scanPath || scanPath.length() < 1) {
            throw new RuntimeException("scan path is required .");
        }
    }

    public static void main(String[] args) throws IOException {
        new GpConfiguration().scanPath("/Users/xbog/Documents/code/spring-demo/src/main/resources/xml/TestMapper.xml").build();
    }

    public String getScanPath() {
        return scanPath;
    }

    public void setScanPath(String scanPath) {
        this.scanPath = scanPath;
    }

    public MapperRegistory getMapperRegistory() {
        return mapperRegistory;
    }

    public void setMapperRegistory(MapperRegistory mapperRegistory) {
        this.mapperRegistory = mapperRegistory;
    }
}
