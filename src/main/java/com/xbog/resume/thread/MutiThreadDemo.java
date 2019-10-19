package com.xbog.resume.thread;

import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

public class MutiThreadDemo {


    public static void concurrentHashMap(){
        ConcurrentHashMap map = new ConcurrentHashMap();
        map.put(1,1);
        map.get(1);

        ReentrantLock lock  = new ReentrantLock();
        lock.tryLock();
        lock.tryLock();
        lock.tryLock();
    }


}
