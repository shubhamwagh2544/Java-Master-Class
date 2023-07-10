package com.javamasterclass.multithreading;

class Thread1 extends Thread {
    public Thread1(String threadName) {
        super(threadName);
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread());         // [name, priority, parent]
        for (int i = 1; i <= 5; i++) {
            System.out.println("running : " + Thread.currentThread().getName() + " -> " + i);
        }
    }
}

class Thread2 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread());         // [name, priority, parent]
        for (int i = 1; i <= 5; i++) {
            System.out.println("running : " + Thread.currentThread().getName() + " -> " + i);
        }
    }
}


public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main starting");

        Thread1 thread1 = new Thread1("my_first_user_thread");
        thread1.start();

        Thread thread = new Thread(new Thread2(), "my_second_user_thread");
        thread.start();

        System.out.println("Main exiting");
    }
}
