package com.xbog.framework.spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Tom on 2018/5/2.
 */
//默认就用JDK动态代理
public class GPAopProxy implements InvocationHandler {

    private GPAopConfig config;
    private Object target;

    //把原生的对象传进来
    public Object getProxy(Object instance) {
        this.target = instance;
        Class<?> clazz = instance.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    public void setConfig(GPAopConfig config) {
        this.config = config;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Method m = this.target.getClass().getMethod(method.getName(), method.getParameterTypes());


        if (config.contains(m)) {
            GPAopConfig.GPAspect aspect = config.get(m);
            aspect.getPoints()[0].invoke(aspect.getAspect());
        }


        Object obj = method.invoke(this.target, args);
        System.out.println(args);

        //在原始方法调用以后要执行增强的代码
        if (config.contains(m)) {
            GPAopConfig.GPAspect aspect = config.get(m);
            aspect.getPoints()[1].invoke(aspect.getAspect());
        }

        //将最原始的返回值返回出去
        return obj;
    }
}
