package com.zk;

import org.apache.zookeeper.*;
import org.apache.zookeeper.data.Stat;

import java.util.concurrent.CountDownLatch;

public class ZkWatcherDemo {

    public static void main(String[] args) throws Exception {
        //建立链接
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ZooKeeper zooKeeper = new ZooKeeper("localhost:2181,localhost:2182,localhost:2183", 2000, new Watcher() {
            @Override
            public void process(WatchedEvent watchedEvent) {
                System.out.println("全局事件类型:"+watchedEvent.getType());
                if (Event.KeeperState.SyncConnected==watchedEvent.getState()){
                    countDownLatch.countDown();
                }
            }
        });
        countDownLatch.await();//主线程等待链接成功
        //添加节点
        zooKeeper.create("/zk-xbog-1","0".getBytes(),ZooDefs.Ids.OPEN_ACL_UNSAFE,CreateMode.PERSISTENT);

        //绑定事件Exits getData、Exits、getChildren
        Stat stat = zooKeeper.exists("/zk-xbog-1", new Watcher() {
            @Override
            public void process(WatchedEvent watchedEvent) {
                System.out.println(watchedEvent.getType()+"-->"+watchedEvent.getPath());
                try {
                    zooKeeper.exists(watchedEvent.getPath(),true);
                } catch (KeeperException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        //修改来触发监听事件
        stat = zooKeeper.setData("/zk-xbog-1","2".getBytes(),stat.getVersion());
        Thread.sleep(2000);

        zooKeeper.delete("/zk-xbog-1",stat.getVersion());
        Thread.sleep(1000);
        System.in.read();
    }
}
