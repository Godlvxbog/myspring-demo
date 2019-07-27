package com.xbog.framework.spring.context;

import com.xbog.framework.spring.beans.GPBeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Tom on 2018/5/2.
 */
public class GPDefaultListableBeanFactory extends GPAbstractApplicationContext {

    //beanDefinitionMap用来保存配置信息
    protected Map<String,GPBeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String,GPBeanDefinition>();

    protected void onRefresh(){

    }

    @Override
    protected void refreshBeanFactory() {

    }
}
