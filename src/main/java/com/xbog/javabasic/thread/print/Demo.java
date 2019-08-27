package com.xbog.javabasic.thread.print;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 */
public class Demo {
    PrintProcessor printProcessor;

    /**
     * 构造方法中开启后台线程。如果有任务来了就立马进行执行
     */
    public Demo() {
        //保存处理器线程启动
        SaveProcessor saveProcessor=new SaveProcessor();
        saveProcessor.start();
        //打印处理器线程启动
        printProcessor=new PrintProcessor(saveProcessor);
        printProcessor.start();
    }

    public static void main(String[] args) {
        Request request=new Request();
        request.setName("xbog");
        new Demo().doTest(request);
    }

    /**
     * 客户端去执行
     * @param request
     */
    public void doTest(Request request){

        printProcessor.processorRequest(request);

    }

}
