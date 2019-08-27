package com.xbog.javabasic.thread.print;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 *
 * extends实现了一个线程，自己是一个线程。
 */
public class PrintProcessor extends Thread implements RequestProcessor{

    LinkedBlockingQueue<Request> printQueue=new LinkedBlockingQueue();

    private final RequestProcessor nextProcessor;

    public PrintProcessor(RequestProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    @Override
    public void run() {
       while(true){
           try {
               Request request=printQueue.take();
               System.out.println("print data:"+request);
               nextProcessor.processorRequest(request);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
    }

    /**
     * 请求 - 添加任务
     * @param request
     */
    @Override
    public void processorRequest(Request request) {
        printQueue.add(request);
    }
}
