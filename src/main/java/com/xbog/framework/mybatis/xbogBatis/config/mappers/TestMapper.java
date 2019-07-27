package com.xbog.framework.mybatis.xbogBatis.config.mappers;


import com.xbog.framework.mybatis.beans.Test;

public interface TestMapper { //com.gupaoedu.mybatis.xbogBatis.config.mappers.TestMapper
    Test selectByPrimaryKey(Integer userId);
}