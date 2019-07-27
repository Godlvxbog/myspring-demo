package com.xbog.javabasic.reflect;

import com.xbog.framework.mybatis.beans.Test;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectDemo {
    public static void main(String[] args) throws Exception{
        Test test = new Test();
        //三种方式获取class
        Class clz1 = test.getClass();
        Class clz2 = Test.class;
        Class clz3 = Class.forName("com.xbog.framework.mybatis.beans.Test");
        System.out.println(clz1+ "_\n"+clz2+"_\n"+clz3);

        //实例化
        Test test1  = (Test)clz1.newInstance();

        //获取方法并调用
        System.out.println("***************获取所有的方法，包括私有的*******************”");
        Method[] methods = clz1.getMethods();
        for(Method m : methods){
            System.out.println(m);
        }

        System.out.println("”***************获取所有的”公有“方法*******************”");

        Method[] methodArray = clz1.getMethods();
        for(Method m : methodArray){
            System.out.println(m);
        }


        System.out.println("”***************获取公有的show1()方法*******************”");
        Method m = clz1.getMethod("show1", String.class);
        System.out.println(m);
        //实例化一个Student对象
        Object obj = clz1.newInstance();
        m.invoke(obj, "我是方法");



        //通过反射获取Class对象
        Class clz5 = Class.forName(getValue("className"));
        //2获取show()方法
        Method m4 = clz5.getMethod(getValue("methodName"),String.class);
        //3.调用show()方法
        m4.invoke(clz5.newInstance(),"laowei");



    }

    //此方法接收一个key，在配置文件中获取相应的value
    public static String getValue(String key) throws IOException {
        Properties pro = new Properties();//获取配置文件的对象
        FileReader in = new FileReader("/Users/xbog/Documents/code/spring-demo/src/main/java/com/xbog/javabasic/reflect/properties.txt");//获取输入流
        pro.load(in);//将流加载到配置文件对象中
        in.close();
        return pro.getProperty(key);//返回根据key获取的value值
    }
}
