package com.javamasterclass.multithreading;

class ThreadOne extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("print random " + i);
        }
        System.out.println("thread one status : " + isAlive());
    }
}
public class JoinMethod {
    public static void main(String[] args) {
        ThreadOne threadOne = new ThreadOne();
        threadOne.start();
        /*
                without join method :
                both threadOne and mainThread starts executing in parallel.

                with join :
                join() method asks another running thread to stop executing until currentThread completes its task (or dies).
                - threadOne is running,
                  and it stops mainThread to stop executing until threadOne's task is finished
         */

        try {
            threadOne.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("thread one new status : " + threadOne.isAlive());
        System.out.println("main thread status : " + Thread.currentThread().isAlive());
    }
}