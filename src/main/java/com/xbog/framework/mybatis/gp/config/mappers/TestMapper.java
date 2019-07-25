package com.xbog.framework.mybatis.gp.config.mappers;


import com.xbog.framework.mybatis.beans.Test;

public interface TestMapper { //com.gupaoedu.mybatis.gp.config.mappers.TestMapper
    Test selectByPrimaryKey(Integer userId);
}