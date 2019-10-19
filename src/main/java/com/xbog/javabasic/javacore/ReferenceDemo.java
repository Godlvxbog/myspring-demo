package com.xbog.javabasic.javacore;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * 强引用：公司核心员工不会被裁员
 * 软引用：GC时，如果容量不够了，此对象的强引用已经删除了，就删除软引用  【缓存就是这个原理】
 * 弱引用：下一次GC就会被回收掉不管内存空间足不足都会回收这个对象，同样也可以配合ReferenceQueue 使用，也同样适用于内存敏感的缓存。ThreadLocal中的key就用到了弱引用。
 * jdk中直接内存的回收就用到虚引用，由于jvm自动内存管理的范围是堆内存，而直接内存是在堆内存之外（其实是内存映射文件，自行去理解虚拟内存空间的相关概念），所以直接内存的分配和回收都是有Unsafe类去操作
 *
 */

public class ReferenceDemo {

    public static void testSoftReference() throws InterruptedException  {
        //100M的缓存数据
        byte[] cacheData = new byte[100 * 1024 * 1024];
        //将缓存数据用软引用持有
        SoftReference<byte[]> cacheRef = new SoftReference<>(cacheData);
        //将缓存数据的强引用去除
        cacheData = null;
        System.out.println("第一次GC前" + cacheData);
        System.out.println("第一次GC前" + cacheRef.get());
        //进行一次GC后查看对象的回收情况
        System.gc();
        //等待GC
        Thread.sleep(500);
        System.out.println("第一次GC后" + cacheData);
        System.out.println("第一次GC后" + cacheRef.get());

        //在分配一个120M的对象，看看缓存对象的回收情况
        byte[] newData = new byte[4*1024 * 1024 * 1024];
        System.out.println("分配后" + cacheData);
        System.out.println("分配后" + cacheRef.get());
        System.out.println(1);
    }

    public static void testWeakReference() throws InterruptedException  {
        //100M的缓存数据
        byte[] cacheData = new byte[100 * 1024 * 1024];
        //将缓存数据用软引用持有
        WeakReference<byte[]> cacheRef = new WeakReference<>(cacheData);
        System.out.println("第一次GC前" + cacheData);
        System.out.println("第一次GC前" + cacheRef.get());
        //进行一次GC后查看对象的回收情况
        System.gc();
        //等待GC
        Thread.sleep(500);
        System.out.println("第一次GC后" + cacheData);
        System.out.println("第一次GC后" + cacheRef.get());

        //将缓存数据的强引用去除
        cacheData = null;
        System.gc();
        //等待GC
        Thread.sleep(500);
        System.out.println("第二次GC后" + cacheData);
        System.out.println("第二次GC后" + cacheRef.get());
    }

    public static void main(String[] args) throws InterruptedException {
        testWeakReference();
    }

}

