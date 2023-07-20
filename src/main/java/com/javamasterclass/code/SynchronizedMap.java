package com.javamasterclass.code;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/*
        Java provides a way for hashmap to work in multithreaded environment

        - Synchronized HashMap : Collections.synchronizedMap()
        - Cons : Performance Slower
        - In multithreaded env, when one thread is trying to read/write/update operation,
          lock was placed on whole buckets (all buckets were locked until that one operation is completed)

        - ConcurrentHashMap : ConcurrentHashMap in java.util.concurrent
        - Pros : Performance Faster => Fine-Grained Lock on each bucket
        - In multithreaded env, when threads are doing read operation, no locks on all buckets (all buckets are open to read)
        - If thread is doing write/update operation, then that specific bucket is only locked (all other buckets are open to read)
 */
public class SynchronizedMap {

    //Collections.synchronizedMap()
    public static void synchronizedMapBefore() {
        Map<Integer, String> hashMap = new HashMap<>();
        //synchronized hashmap for multithreaded env
        Map<Integer, String> map = Collections.synchronizedMap(hashMap);
    }

    //ConcurrentHashMap in java.util.concurrent
    public static void synchronizedMapAfter() {
        Map<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();
    }

    public static void main(String[] args) {
        System.out.println("Synchronized Map Before => Collections.synchronizedMap()");
        synchronizedMapBefore();

        System.out.println("Synchronized Map After => ConcurrentHashMap");
        synchronizedMapAfter();
    }
}
