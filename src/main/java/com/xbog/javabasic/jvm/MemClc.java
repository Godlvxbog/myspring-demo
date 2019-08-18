package com.xbog.javabasic.jvm;

public class MemClc {
    public static void main(String[] args) {

        long maxMem = Runtime.getRuntime().maxMemory();
        long totalMem = Runtime.getRuntime().totalMemory();
        System.out.println("max Mem =" + maxMem / 1024 / 1024);
        System.out.println("totalMem = " + totalMem / 1024 / 1024);


    }
}
