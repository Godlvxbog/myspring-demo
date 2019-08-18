package com.xbog.javabasic.jvm;

import java.util.ArrayList;
import java.util.List;

public class TestJvm {

    String[] strs = new String[2 * 1024 * 1024];

    public static void main(String[] args) {
        int i = 0;
        List<TestJvm> testJvms = new ArrayList<>();
        System.out.println(i++);
        testJvms.add(new TestJvm());
        System.gc();
    }

}
