package com.xbog.javabasic.thread.print;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 */
public class SaveProcessor extends Thread implements RequestProcessor{

    LinkedBlockingQueue<Request> saveQueue=new LinkedBlockingQueue();

    @Override
    public void run() {
        while(true){
            try {
                Request request=saveQueue.take();
                System.out.println("save data:"+request);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void processorRequest(Request request) {
        saveQueue.add(request);
    }
}
