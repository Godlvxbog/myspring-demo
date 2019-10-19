package com.xbog.resume.thread;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicbarrierDemo {

    private static CyclicBarrier barrier = new CyclicBarrier(5);

    public static void testBarrier() throws Exception {

        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 0; i < 10; i++) {
            final int threadNum = i;
            Thread.sleep(1000);
            executor.execute(() -> {
                try {
                    race(threadNum);
                    System.out.println("开始跑步" + threadNum);
                } catch (Exception e) {
                }
            });
        }
        executor.shutdown();
    }

    private static void race(int threadNum) throws Exception {
        System.out.println(threadNum+ "开始工作");
        Thread.sleep(1000);
        System.out.println(threadNum+ "is ready");
        barrier.await();
    }


    public static void main(String[] args) throws Exception {

        testBarrier();

    }
}
