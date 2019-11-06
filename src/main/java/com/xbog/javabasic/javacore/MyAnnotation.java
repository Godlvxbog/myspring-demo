package com.xbog.javabasic.javacore;


import java.lang.annotation.*;

@Target({ ElementType.METHOD, ElementType.TYPE, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface MyAnnotation {

    // 定义注解的属性，这不是方法
    String name();// 必选注解

    String age() default "18";

    int value() default 20;// 有属性就是可选属性
}
