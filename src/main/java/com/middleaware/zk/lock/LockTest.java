package com.middleaware.zk.lock;

import java.util.concurrent.CountDownLatch;

public class LockTest {
    public static void main(String[] args) throws Exception{
        //定义10个线程
        CountDownLatch countDownLatch = new CountDownLatch(10);
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                try {
                    countDownLatch.await();
                    DistributeLock distributeLock = new DistributeLock();
                    distributeLock.lock();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            },"Thead -- "+i).start();
            countDownLatch.countDown();

        }
        System.in.read();

    }
}
