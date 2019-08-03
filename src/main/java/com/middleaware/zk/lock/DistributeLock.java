package com.middleaware.zk.lock;

import org.apache.zookeeper.*;
import org.apache.zookeeper.data.Stat;

import java.io.IOException;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class DistributeLock implements Lock, Watcher {

    /**
     * 首先定义一些需要的变量
     */
    private ZooKeeper zk = null;
    private String ROOT_LOCK = "/locks";
    private String WAIT_LOCK;
    private String CURRENT_LOCK;
    private CountDownLatch countDownLatch;//作为控制用


    /**
     * 通过构造方法初始化我们的变量
     */
    public DistributeLock() {
        try {
            zk = new ZooKeeper("127.0.0.1:2181,127.0.0.1:2182,127.0.0.1:2183", 4000, this);
            Stat stat = zk.exists(ROOT_LOCK, false);

            if (stat == null) {
                zk.create(ROOT_LOCK, "0".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (KeeperException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void lock() {
        if (this.tryLock()) {
            System.out.println(Thread.currentThread().getName() + "-->" + CURRENT_LOCK + "获取锁成功");
            return;
        }
        //如果没有获取锁，就持续等待阻塞
        try {
            waitForLock(WAIT_LOCK);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean waitForLock(String prev) throws Exception {
        Stat stat = zk.exists(prev, true);//监听上一个节点：true，添加了一个watch事件，如果有变更的话会有通知的。
        if (stat != null) {
            System.out.println(Thread.currentThread().getName() + "--> 等待锁" + ROOT_LOCK + "/" + prev + "释放");
            countDownLatch = new CountDownLatch(1);
            countDownLatch.await();
            System.out.println(Thread.currentThread().getName() + "-->获取锁成功");
        }
        return true;

    }

    @Override
    public void lockInterruptibly() throws InterruptedException {

    }

    @Override
    public boolean tryLock() {
        try {
//            一个客户端去获取lock时首先去创建临时有序节点
            CURRENT_LOCK = zk.create(ROOT_LOCK + "/", "0".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL_SEQUENTIAL);
            System.out.println(Thread.currentThread().getName() + "-->" + CURRENT_LOCK + ",尝试获取锁");
            //获取根节点下的所有子节点,并排序
            List<String> childrens = zk.getChildren(ROOT_LOCK, false);
            SortedSet<String> sortedSet = new TreeSet<>();
            for (String children : childrens) {
                sortedSet.add(ROOT_LOCK + "/" + children);
            }
            String firstNode = sortedSet.first();//拿到集合的最小节点
            SortedSet<String> lessThanMe = ((TreeSet<String>) sortedSet).headSet(CURRENT_LOCK);
            if (CURRENT_LOCK.equals(firstNode)) {//比较当前客户端的节点如果是所有子节点的最小的话就拿到锁
                return true;
            }

            if (!lessThanMe.isEmpty()) {
                WAIT_LOCK = lessThanMe.last();//获得比自己当前小的最后一个节点，设置为等待的lock，然后监听这个节点
            }
            return false;


        } catch (KeeperException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public void unlock() {
        try {
            System.out.println(Thread.currentThread().getName() + "-->释放锁" + CURRENT_LOCK);
            zk.delete(CURRENT_LOCK, -1);
            CURRENT_LOCK = null;
            zk.close();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (KeeperException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Condition newCondition() {
        return null;
    }

    /**
     * watch的监听事件
     *
     * @param event
     */
    @Override
    public void process(WatchedEvent event) {
        if (this.countDownLatch != null) {
            this.countDownLatch.countDown();
        }
    }
}
