package com.xbog.framework.mybatis.mybatis.mapper;


import java.util.List;

import com.xbog.framework.mybatis.mybatis.beans.Posts;
import com.xbog.framework.mybatis.mybatis.beans.PostsExample;
//import org.apache.ibatis.annotations.Param;

public interface PostsMapper {
    int countByExample(PostsExample example);

    int deleteByExample(PostsExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(Posts record);

    int insertSelective(Posts record);

    List<Posts> selectByExample(PostsExample example);

    Posts selectByPrimaryKey(Integer pid);

//    int updateByExampleSelective(@Param("record") Posts record, @Param("example") PostsExample example);
//
//    int updateByExample(@Param("record") Posts record, @Param("example") PostsExample example);

    int updateByPrimaryKeySelective(Posts record);

    int updateByPrimaryKey(Posts record);
}