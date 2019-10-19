package com.xbog.resume;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

//LocalCache这个是主要类。
//CacheStats ：缓存访问的统计


public class GuavaCache {








    public void guavaTest(){
        LoadingCache<String,String> cache= CacheBuilder.newBuilder()
                .maximumSize(1000) //最大缓存数目
                .concurrencyLevel(4)
                .initialCapacity(100)
                .recordStats()
                .expireAfterAccess(1, TimeUnit.SECONDS) //缓存1秒后过期
                .build(new CacheLoader<String, String>() {
                    @Override
                    public String load(String key) throws Exception {
                        return key;
                    }
                });
        cache.put("j","java");
        cache.put("c","cpp");
        cache.put("s","scala");
        cache.put("g","go");
        try {
            System.out.println(cache.get("j"));
            TimeUnit.SECONDS.sleep(2);
            System.out.println(cache.get("s")); //输出s
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}
