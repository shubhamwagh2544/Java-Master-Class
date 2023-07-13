package com.javamasterclass.multithreading;

/*
            yield() :
            - causes currentThread to pause/stop executing for giving chance to remaining waiting threads of same priority.
            - if there are no waiting threads
              or waiting threads have lower priority than currentThread, then same thread will start executing again.

            - yield() method output can't be predicted ;)
 */
class A extends Thread {
    @Override
    public void run() {
        System.out.println("A status:" + isAlive());
        for (int i = 1; i <= 5; i++) {
            if (i == 2) {
                Thread.yield();
            }
            System.out.println("A : " + i);
        }
    }
}

class B extends Thread {
    @Override
    public void run() {
        System.out.println("B status :"+ isAlive());
        for (int i = 1; i <= 5; i++) {
            System.out.println("B : " + i);
        }
    }
}


public class YieldMethod {
    public static void main(String[] args) throws InterruptedException {
        A aThread = new A();
        B bThread = new B();

        aThread.start();
        bThread.start();
    }
}
