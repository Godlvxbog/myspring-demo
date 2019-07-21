package com.xbog.framework.mybatis.mybatis.mapper;


import java.util.List;

import com.xbog.framework.mybatis.mybatis.beans.Test;
import com.xbog.framework.mybatis.mybatis.beans.TestExample;
//import org.apache.ibatis.annotations.Param;

public interface TestMapper {
    int countByExample(TestExample example);

    int deleteByExample(TestExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Test record);

    int insertSelective(Test record);

    List<Test> selectByExample(TestExample example);

    Test selectByPrimaryKey(Integer id);
//
//    int updateByExampleSelective(@Param("record") Test record, @Param("example") TestExample example);
//
//    int updateByExample(@Param("record") Test record, @Param("example") TestExample example);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);
}