package com.xbog.framework.spring.beans;

import com.xbog.framework.spring.aop.GPAopConfig;
import com.xbog.framework.spring.aop.GPAopProxy;
import com.xbog.framework.spring.core.GPFactoryBean;

/**
 * Created by Tom on 2018/4/21.
 */
public class GPBeanWrapper extends GPFactoryBean {

    private GPAopProxy aopProxy = new GPAopProxy();

    public GPBeanPostProcessor getPostProcessor() {
        return postProcessor;
    }

    public void setPostProcessor(GPBeanPostProcessor postProcessor) {
        this.postProcessor = postProcessor;
    }

    //还会用到  观察者  模式
    //1、支持事件响应，会有一个监听
    private GPBeanPostProcessor postProcessor;

    private Object wrapperInstance;
    //原始的通过反射new出来，要把包装起来，存下来
    private Object originalInstance;

    public GPBeanWrapper(Object instance){
        //从这里开始，我们要把动态的代码添加进来了
        this.wrapperInstance = aopProxy.getProxy(instance);
        this.originalInstance = instance;
    }

    public Object getWrappedInstance(){
        return this.wrapperInstance;
    }


    // 返回代理以后的Class
    // 可能会是这个 $Proxy0
    public Class<?> getWrappedClass(){
        return this.wrapperInstance.getClass();
    }


    public void setAopConfig(GPAopConfig config){
        aopProxy.setConfig(config);
    }


    public Object getOriginalInstance() {
        return originalInstance;
    }
}
