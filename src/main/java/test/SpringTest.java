package test;

import com.xbog.demo.action.MyAction;
import com.xbog.framework.spring.context.GPApplicationContext;
import com.xbog.framework.webmvc.servlet.GPDispatcherServlet;

public class SpringTest {
    public static void main(String[] args) {
        GPApplicationContext context = new GPApplicationContext("application.properties");
        MyAction myAction = (MyAction) context.getBeanInstance("com.xbog.demo.action.MyAction");
        GPDispatcherServlet gpDispatcherServlet = (GPDispatcherServlet) context.getBeanInstance("com.xbog.framework.webmvc.servlet.GPDispatcherServlet");
        System.out.println(gpDispatcherServlet);
    }
}
