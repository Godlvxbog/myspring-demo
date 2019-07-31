package com.xbog.framework.mybatis.xbogBatis;


import com.xbog.framework.mybatis.beans.Test;
import com.xbog.framework.mybatis.mapper.TestMapper;
import com.xbog.framework.mybatis.xbogBatis.config.GpConfiguration;
import com.xbog.framework.mybatis.xbogBatis.executor.Executor;
import com.xbog.framework.mybatis.xbogBatis.session.GpSqlSession;
import com.xbog.framework.mybatis.xbogBatis.executor.ExecutorFactory;

/**
 * Created by James on 2017-07-05.
 * From 咕泡学院出品
 * 老师咨询 QQ 2904270631
 */
public class BootStrap {
    public static void main(String[] args) throws Exception {
        start();
    }

    private static void start() throws Exception {
        GpConfiguration configuration = new GpConfiguration();
        configuration.setScanPath("com.xbog.demo.mybatis.mapper");
        configuration.build();
        String exectorKey = ExecutorFactory.ExecutorType.SIMPLE.name();
        Executor executor  = ExecutorFactory.get(exectorKey,configuration);
        GpSqlSession sqlSession = new GpSqlSession(configuration,executor);

        TestMapper testMapper = sqlSession.getMapper(TestMapper.class);
        Test test2 = testMapper.selectByPrimaryKey(1);
        System.out.println(test2);
    }
}
