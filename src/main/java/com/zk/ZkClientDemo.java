package com.zk;

import org.I0Itec.zkclient.IZkDataListener;
import org.I0Itec.zkclient.ZkClient;
import org.apache.zookeeper.CreateMode;

import java.io.IOException;

public class ZkClientDemo {

    public static void main(String[] args) throws IOException {
        ZkClient zkClient = new ZkClient("localhost:2181", 1000);
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
