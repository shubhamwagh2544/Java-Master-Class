package com.javamasterclass.multithreading;

public class ThreadLocalImplementation {

    private static ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(() -> 0);
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            threadLocal.set(10);
            System.out.println("Thread 1 : " + threadLocal.get());
        });

        Thread thread2 = new Thread(() -> {
            threadLocal.set(20);
            System.out.println("Thread 2 : " + threadLocal.get());
        });

        //start threads
        thread1.start();
        thread2.start();
    }
}
