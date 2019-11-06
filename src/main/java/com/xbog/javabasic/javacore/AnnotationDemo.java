package com.xbog.javabasic.javacore;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@MyAnnotation(name = "吴博",age = "18")
public class AnnotationDemo {



    @MyAnnotation(name = "show方法上面",age = "29")
    public void show(String str) {

    }

    @MyAnnotation(name = "show2方法上面")
    public void show2(String str) {
    }



    public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException, NoSuchFieldException {

        // 获取类上的注解
        MyAnnotation annotationsByType = AnnotationDemo.class.getAnnotation(MyAnnotation.class);
        printAnnotation(annotationsByType);

        // 获取方法上面的注解
        Method method = AnnotationDemo.class.getMethod("show", String.class);
        MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
        printAnnotation(annotation);

        Method method2 = AnnotationDemo.class.getMethod("show2", String.class);
        MyAnnotation annotation2 = method2.getAnnotation(MyAnnotation.class);
        printAnnotation(annotation2);

    }


    private static void printAnnotation(MyAnnotation annotation) {
        if (annotation != null) {
            System.out.println(annotation.name() + "\t" + annotation.value());
        } else {
            System.out.println("null");
        }
    }
}
