package com.xbog.javabasic.javacore;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


public class BlockingQueue {

    public static void main(String[] args) throws InterruptedException {
        LinkedBlockingQueue queue = new LinkedBlockingQueue();

        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(50);
        arrayBlockingQueue.put("test1");

        queue.put("test");
        String str = (String) queue.take();
        System.out.println(str);

    }
}
