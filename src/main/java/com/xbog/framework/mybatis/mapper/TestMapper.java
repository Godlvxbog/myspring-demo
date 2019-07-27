package com.xbog.framework.mybatis.mapper;


import com.xbog.framework.mybatis.beans.Test;

import java.util.List;

public interface TestMapper {
    List<Test> selectTest();

    Test selectByPrimaryKey(int id);
}