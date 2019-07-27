package com.xbog.framework.mybatis.xbogBatis;


import com.xbog.framework.mybatis.beans.Test;
import com.xbog.framework.mybatis.xbogBatis.config.GpConfiguration;
import com.xbog.framework.mybatis.xbogBatis.config.mappers.TestMapper;
import com.xbog.framework.mybatis.xbogBatis.executor.Executor;
import com.xbog.framework.mybatis.xbogBatis.session.GpSqlSession;
import com.xbog.framework.mybatis.xbogBatis.executor.ExecutorFactory;

import java.io.IOException;

/**
 * Created by James on 2017-07-05.
 * From 咕泡学院出品
 * 老师咨询 QQ 2904270631
 */
public class BootStrap {
    public static void main(String[] args) throws IOException {
        start();
    }

    private static void start() throws IOException {
        GpConfiguration configuration = new GpConfiguration();
        configuration.setScanPath("com.xbog.framework.mybatis.xbogBatis.mapper");
        configuration.build();
//        GpSqlSession sqlSession = new GpSqlSession(configuration, ExecutorFactory.DEFAULT(configuration));
        String exectorKey = ExecutorFactory.ExecutorType.CACHING.name();
        Executor executor  = ExecutorFactory.get(exectorKey,configuration);
        GpSqlSession sqlSession = new GpSqlSession(configuration,executor);

        TestMapper testMapper = sqlSession.getMapper(TestMapper.class);
        long start = System.currentTimeMillis();
        Test test = testMapper.selectByPrimaryKey(1);
        System.out.println("cost:"+ (System.currentTimeMillis() -start));
//        start = System.currentTimeMillis();
//        test = testMapper.selectByPrimaryKey(1);
//        System.out.println("cost:"+ (System.currentTimeMillis() -start));
//        System.out.println(test);
    }
}
