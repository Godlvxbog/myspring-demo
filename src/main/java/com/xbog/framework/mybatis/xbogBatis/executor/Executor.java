package com.xbog.framework.mybatis.xbogBatis.executor;


import com.xbog.framework.mybatis.xbogBatis.config.MapperData;

/**
 * Created by James on 2017-07-01.
 * From 咕泡学院出品
 * 老师咨询 QQ 2904270631
 */
public interface Executor {

    <T> T query(MapperData mapperData, Object parameter) throws Exception;
}
