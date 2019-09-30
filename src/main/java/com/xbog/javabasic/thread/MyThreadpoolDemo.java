package com.xbog.javabasic.thread;

import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThreadpoolDemo extends ThreadPoolExecutor{

    public MyThreadpoolDemo(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
    }

    public static void main(String[] args) {

        testLock();

    }

    @Override
    protected void beforeExecute(Thread t, Runnable r) {
        super.beforeExecute(t, r);
        System.out.println(this.getActiveCount()+ this.getCorePoolSize() + this.getCompletedTaskCount());
    }


    public static void  testLock(){
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i=0;i< 10;i++){
            Lock lock = new ReentrantLock();
            lock.tryLock();//当前线程获取到了锁
            lock.lock();
            System.out.println(((ReentrantLock) lock).getHoldCount());
            lock.unlock();
            System.out.println(((ReentrantLock) lock).getHoldCount());


            executorService.submit(new ChargeProcess());
            lock.unlock();
        }



    }

    public static class ChargeProcess implements Runnable{

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());

            System.out.println("加载当前产品账的余额");
            System.out.println("给当前用户增加产品账 1000 ￥");
        }
    }
}
