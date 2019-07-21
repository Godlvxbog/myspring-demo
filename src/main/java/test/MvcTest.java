package test;

import com.xbog.framework.webmvc.servlet.GPDispatcherServlet;

import javax.servlet.ServletException;

public class MvcTest {
    public static void main(String[] args) throws ServletException {
        GPDispatcherServlet dispatcherServlet = new GPDispatcherServlet();

        dispatcherServlet.init();
        System.out.println(1);

    }
}
