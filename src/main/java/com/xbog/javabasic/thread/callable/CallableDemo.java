package com.xbog.javabasic.thread.callable;

import java.util.concurrent.*;

public class CallableDemo implements Callable<String> {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        CallableDemo callableDemo = new CallableDemo();
        Future<String> res = executorService.submit(callableDemo); //这里只是提交任务

        System.out.println("主线程我不等你了，我要去做自己的事情了");

        System.out.println(res.get());  //这里是阻塞的
    }


    @Override
    public String call() throws Exception {
        return "子线程（耗时任务）返回结果了。";
    }
}
