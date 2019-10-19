package com.xbog.resume.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CountdownLatchDemo {

    private final static int threadCount = 200;

    public static void testCountDownLatch() throws Exception {

        ExecutorService exec = Executors.newCachedThreadPool();

        final CountDownLatch countDownLatch = new CountDownLatch(threadCount);

        for (int i = 0; i < threadCount; i++) {
            final int threadNum = i;
            exec.execute(() -> {
                try {
                    test(threadNum);
                } catch (Exception e) {
                } finally {
                    countDownLatch.countDown();
                }
            });
        }
        countDownLatch.await(10, TimeUnit.MILLISECONDS);
        exec.shutdown();
    }

    private static void test(int threadNum) throws Exception {
        System.out.println(threadNum +"开始执行任务");
        Thread.sleep(1000);
        System.out.println(threadNum +"=====执行任务done====");
    }


    public static void main(String[] args) throws Exception {
//        concurrentHashMap();

//        testBarrier();

        testCountDownLatch();
    }
}
