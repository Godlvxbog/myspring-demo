package com.xbog.framework.mybatis.xbogBatis.session;


import com.xbog.framework.mybatis.xbogBatis.config.GpConfiguration;
import com.xbog.framework.mybatis.xbogBatis.config.MapperRegistory;
import com.xbog.framework.mybatis.xbogBatis.executor.Executor;
import com.xbog.framework.mybatis.xbogBatis.mapper.MapperProxy;

import java.lang.reflect.Proxy;

/**
 * Created by James on 2017-07-01.
 * From 咕泡学院出品
 * 老师咨询 QQ 2904270631
 */
public class GpSqlSession {
    private GpConfiguration configuration;
    private Executor executor;

    public GpConfiguration getConfiguration() {
        return configuration;
    }

    //关联起来
    public GpSqlSession(GpConfiguration configuration, Executor executor) {
        this.configuration = configuration;
        this.executor = executor;
    }

    public <T> T getMapper(Class<T> clazz) {
        return (T) Proxy.newProxyInstance(clazz.getClassLoader(),
                new Class[]{clazz},new MapperProxy(this,clazz));
    }

    public <T> T selectOne(MapperRegistory.MapperData mapperData, Object parameter) throws Exception {
        return executor.query(mapperData, parameter);
    }
}
