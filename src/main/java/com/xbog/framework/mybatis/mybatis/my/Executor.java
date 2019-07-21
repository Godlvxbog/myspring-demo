package com.xbog.framework.mybatis.mybatis.my;

public interface Executor {
    <E> E query(String statement, Object parameter);
}