package com.xbog.framework.spring.beans;

/**
 * Created by Tom on 2018/4/21.
 */
//用做事件监听的
public class GPBeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        return bean;
    }
    public Object postProcessAfterInitialization(Object bean, String beanName){
        return bean;
    }

}
