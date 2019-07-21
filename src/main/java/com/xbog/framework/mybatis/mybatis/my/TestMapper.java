package com.xbog.framework.mybatis.mybatis.my;


import test.Test;

public interface TestMapper {
    Test selectByPrimaryKey(Integer userId);
}