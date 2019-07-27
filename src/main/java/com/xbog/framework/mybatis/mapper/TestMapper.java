package com.xbog.framework.mybatis.mapper;


import com.xbog.framework.mybatis.beans.Test;

public interface TestMapper {
    public Test selectByPrimaryKey(int id);
}