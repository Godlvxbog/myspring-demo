package com.xbog.javabasic.javacore;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

public class HashMapTest {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();//HashMap对象
        Map<String, String> table = new Hashtable<String, String>();//HashTable对象

        map.put(null, null);
        System.out.println("hashMap的[key]和[value]均可以为null:" + map.get(null));

        map.put("tst","tst");
        map.put("tst","tst2222");
        System.out.println(map.get("tst"));

        try {
            table.put(null, "3");
            System.out.println(table.get(null));
        } catch (Exception e) {
            System.out.println("【ERROR】：hashTable的[key]不能为null");
        }

        try {
            table.put("3", null);
            System.out.println(table.get("3"));
        } catch (Exception e) {
            System.out.println("【ERROR】：hashTable的[value]不能为null");
        }


        HashSet set = new HashSet();
        set.add(new HashMapTest());
        set.add(new HashMapTest());
        System.out.println(set.toArray());

        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("test","est");


        String str1 =new String("nihao") ;
        String str3 =new String("nihao") ;
        String str2 ="nihao";
        System.out.println(str1==str3);

        HashMapTest ref1 = new HashMapTest() ;
        HashMapTest ref2 = new HashMapTest();
        System.out.println(ref1 ==ref2);

        ReentrantLock lock = new ReentrantLock();
        lock.newCondition();



        List list = new ArrayList();
        list.add(null);
        System.out.println(list);


        Object object = new Object();
        object.equals(object);

        String string = new String();
        string.equals(string);

        List list1 = new  LinkedList();


        BlockingQueue queue = new ArrayBlockingQueue(1000);
        try {
            queue.put("1212");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }


}
