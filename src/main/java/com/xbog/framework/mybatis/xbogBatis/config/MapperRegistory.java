package com.xbog.framework.mybatis.xbogBatis.config;



import test.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by James
 * From 咕泡学院出品
 * 老师咨询 QQ 2904270631
 */
public class MapperRegistory {
    public static final Map<String, MapperData> methodSqlMapping = new HashMap();

    //使用 1. 在这里配置
    //2. Java Bean的属性名字要和数据库表的名字一致
    public MapperRegistory() {
        methodSqlMapping.put("com.xbog.framework.mybatis.mapper.TestMapper.selectByPrimaryKey",
                new MapperData("select * from test where id = %d", Test.class));
    }

    public MapperData get(String nameSpace) {
        return methodSqlMapping.get(nameSpace);
    }
}
