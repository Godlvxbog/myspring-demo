package com.xbog.javabasic.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * threadlocal必须要remove去删除，防止线程池中线程复用原来的线程。
 */
public class ThreadLocalDemo {

    private static ThreadLocal<Integer> variableHolder = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return 0;
        }

    };

    public static int getValue() {
        return variableHolder.get();
    }

    public static void remove() {
        variableHolder.remove();
    }

    public static void increment() {
        variableHolder.set(variableHolder.get() + 1);
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 15; i++) {
            executor.execute(() -> {
                try {
                    long threadId = Thread.currentThread().getId();
                    int before = getValue();
                    increment();
                    int after = getValue();
                    System.out.println("threadId: " + threadId + ", before: " + before + ", after: " + after);
                } finally {
                    remove();
                }
            });
        }
        executor.shutdown();
    }
}
