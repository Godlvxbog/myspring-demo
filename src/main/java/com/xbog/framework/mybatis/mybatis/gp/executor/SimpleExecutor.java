package com.xbog.framework.mybatis.mybatis.gp.executor;


import com.xbog.framework.mybatis.mybatis.gp.config.GpConfiguration;
import com.xbog.framework.mybatis.mybatis.gp.config.MapperRegistory;
import com.xbog.framework.mybatis.mybatis.gp.statement.StatementHandler;

public class SimpleExecutor implements Executor {
    private GpConfiguration configuration;

    public SimpleExecutor(GpConfiguration configuration) {
        this.configuration = configuration;
    }

    public GpConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(GpConfiguration configuration) {
        this.configuration = configuration;
    }

    public <E> E query(MapperRegistory.MapperData mapperData, Object parameter)
            throws Exception {
        //初始化StatementHandler --> ParameterHandler --> ResultSetHandler
        StatementHandler handler = new StatementHandler(configuration);
        return (E) handler.query(mapperData, parameter);
    }
}