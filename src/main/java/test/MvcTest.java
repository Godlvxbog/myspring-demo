package test;

import com.xbog.framework.spring.context.GPApplicationContext;
import com.xbog.framework.webmvc.servlet.GPDispatcherServlet;

import javax.servlet.ServletException;


public class MvcTest {
    public static void main(String[] args) throws ServletException {

        GPApplicationContext context = new GPApplicationContext("classpath:application.properties");
        GPDispatcherServlet gpDispatcherServlet = (GPDispatcherServlet) context.getBeanInstance("com.xbog.framework.webmvc.servlet.GPDispatcherServlet");

//        initStrategies(context);
        System.out.println("http://localhost:8080/web/addTeacher.json?name=zhangshan&addr=sicuan");

    }
}
