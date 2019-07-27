package com.xbog.framework.mybatis.xbogBatis.session;


import com.xbog.framework.mybatis.xbogBatis.config.GpConfiguration;
import com.xbog.framework.mybatis.xbogBatis.config.MapperData;
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

    public <T> T getMapper(Class<T> clazz) throws Exception{
        MapperProxy mapperProxy =new MapperProxy(this,clazz);

        ClassLoader classLoader =clazz.getClassLoader();//类加载器

        Class<?>[] interfaces =clazz.getInterfaces();//接口


        MapperRegistory mapperRegistory = getConfiguration().getMapperRegistory();

        String namespace ="com.xbog.framework.mybatis.mapper.TestMapper.selectByPrimaryKey";
        MapperData mapperData = mapperRegistory.get(namespace);

        System.out.println(mapperData);
//        if (null != mapperData) {
//            System.out.println(String.format("SQL [ %s ], parameter [%s] ", mapperData.getSql(), "1"));
//            return selectOne(mapperData, String.valueOf("1"));
//        }



        T t = (T) Proxy.newProxyInstance(classLoader,interfaces,mapperProxy);

        return t;
    }

    public <T> T selectOne(MapperData mapperData, Object parameter) throws Exception {
        return executor.query(mapperData, parameter);
    }
}
