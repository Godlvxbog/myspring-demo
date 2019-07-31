package com.middleaware.zk;

import org.I0Itec.zkclient.IZkDataListener;
import org.I0Itec.zkclient.ZkClient;
import org.apache.zookeeper.*;
import org.apache.zookeeper.data.Stat;

import java.util.concurrent.CountDownLatch;

public class ZkClientDemo {

    public static void main(String[] args) throws Exception {
        //建立链接
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ZooKeeper zooKeeper = new ZooKeeper("localhost:2181,localhost:2182,localhost:2183", 2000, new Watcher() {
            @Override
            public void process(WatchedEvent watchedEvent) {
                if (Event.KeeperState.SyncConnected==watchedEvent.getState()){
                    countDownLatch.countDown();
                }
            }
        });
        countDownLatch.await();//主线程等待链接成功
        System.out.println(zooKeeper.getState());

        //添加节点
        zooKeeper.create("/zk-xbog","0".getBytes(),ZooDefs.Ids.OPEN_ACL_UNSAFE,CreateMode.PERSISTENT);
        Thread.sleep(1000);
        Stat stat = new Stat();
        byte[] bytes = zooKeeper.getData("/zk-xbog",null,stat);
        System.out.println(new String(bytes));

        //修改：带有版本号的。乐观锁的实现
        zooKeeper.setData("/zk-xbog","1".getBytes(),stat.getVersion());

        byte[] bytes2 = zooKeeper.getData("/zk-xbog",null,stat);
        System.out.println(new String(bytes2));

        zooKeeper.delete("/zk-xbog",stat.getVersion());

        System.in.read();

        ZkClient zkClient = new ZkClient("localhost:2181,localhost:2182,localhost:2183", 1000);
        //获取指定路径的子节点个数
        System.out.println(zkClient.countChildren("/"));
        //如果节点存在则删除该节点
        if (zkClient.exists("/dubbo")) {
            zkClient.delete("/dubbo");
        }
        //创建永久的节点
        String nodeName = zkClient.create("/dubbo", "{\"name\":\"admin\"}", CreateMode.PERSISTENT);
        System.out.println(nodeName);
        //创建临时节点
        zkClient.createEphemeralSequential("/dubbo/test", "a");
        zkClient.createEphemeralSequential("/dubbo/test", "b");
        //读取节点数据
        System.out.println(zkClient.readData("/dubbo").toString());
        //订阅dubbo数据的变化
        zkClient.subscribeDataChanges("/dubbo", new IZkDataListener() {
            @Override
            public void handleDataChange(String dataPath, Object data) throws Exception {
                System.out.println(dataPath+"节点数据发生变化。。。");
            }

            @Override
            public void handleDataDeleted(String dataPath) throws Exception {
                System.out.println(dataPath+"节点数据被删除....");
            }
        });
        //订阅dubbo子节点的变化
        zkClient.subscribeChildChanges("/dubbo",(parentPath, currentChilds) -> System.out.println("dubbo节点发生变化"));

        //更新dubbo节点的数据
        zkClient.writeData("/dubbo", "dubbo");
        System.in.read();
    }
}
