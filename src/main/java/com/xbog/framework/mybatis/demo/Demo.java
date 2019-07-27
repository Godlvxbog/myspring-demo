package com.xbog.framework.mybatis.demo;

import com.xbog.framework.mybatis.beans.Test;
import com.xbog.framework.mybatis.mapper.TestMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Created by James on 2017-09-08.
 * From 咕泡学院出品
 * 老师咨询 QQ 2904270631
 */
public class Demo {
    public static SqlSession getSqlSession() throws FileNotFoundException {
        //配置文件
        InputStream configFile = new FileInputStream(
                "/Users/xbog/Documents/code/spring-demo/src/main/resources/mybatis/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configFile);
        //加载配置文件得到SqlSessionFactory
        SqlSession session = sqlSessionFactory.openSession();

        return session;
    }

    public static void main(String[] args) throws FileNotFoundException {
        SqlSession session =getSqlSession();
        TestMapper testMapper =session.getMapper(TestMapper.class);
        Test test = testMapper.selectByPrimaryKey(1);
        System.out.println(test);
    }
}
