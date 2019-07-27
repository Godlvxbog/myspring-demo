package com.xbog.framework.mybatis.xbogBatis.mapper;


import com.xbog.framework.mybatis.beans.Test;
import com.xbog.framework.mybatis.mapper.TestMapper;
import com.xbog.framework.mybatis.xbogBatis.config.MapperData;
import com.xbog.framework.mybatis.xbogBatis.session.GpSqlSession;
import com.xbog.framework.mybatis.xbogBatis.config.MapperRegistory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by James on 2017-07-01.
 * From 咕泡学院出品
 * 老师咨询 QQ 2904270631
 */
public class MapperProxy<T> implements InvocationHandler {
    private final GpSqlSession sqlSession;
    private final Class<T> mappperInterface;

    public MapperProxy(GpSqlSession gpSqlSession, Class<T> clazz) {
        this.sqlSession = gpSqlSession;
        this.mappperInterface = clazz;
    }

    public Object invoke(Object target, Method method, Object[] args) throws Throwable {

        MapperRegistory mapperRegistory = sqlSession.getConfiguration().getMapperRegistory();

//        String namespace=method.getDeclaringClass().getName()+ "." + method.getName();
        String namespace ="com.xbog.framework.mybatis.mapper.TestMapper.selectByPrimaryKey";

        MapperData mapperData = mapperRegistory.get(namespace);
//        System.out.println(mapperData);

        if (null != mapperData) {
            System.out.println(String.format("SQL [ %s ], parameter [%s] ", mapperData.getSql(), args[0]));
            return sqlSession.selectOne(mapperData, String.valueOf(args[0]));
        }

//        调用target
        Object object = method.invoke(target, args);

        return object;
    }

}
