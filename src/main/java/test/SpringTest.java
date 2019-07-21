package test;

import com.xbog.demo.action.MyAction;
import com.xbog.framework.context.GPApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        GPApplicationContext context = new GPApplicationContext("application.properties");
        MyAction myAction = (MyAction) context.getBeanInstance("com.xbog.demo.action.MyAction");
        System.out.println(myAction);
    }
}
