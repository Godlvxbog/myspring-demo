package com.middleaware.zk.lock;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.locks.InterProcessMutex;

public class CuratorDemo {
    public static void main(String[] args) {
        CuratorFramework curatorFramework=CuratorFrameworkFactory.builder().build();
        //可重入锁
        InterProcessMutex interProcessMutex=new InterProcessMutex(curatorFramework,"/locks");
        try {
            //实现了分布式锁
            interProcessMutex.acquire();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            interProcessMutex.acquire();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
