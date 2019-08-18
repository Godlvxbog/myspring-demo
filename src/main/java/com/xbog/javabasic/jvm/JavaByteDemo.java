package com.xbog.javabasic.jvm;

import java.io.IOException;

public class JavaByteDemo {
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 10; i++) {
            if (i%2==1){
                System.out.println(i);
                System.in.read();
            }
        }
    }
}
