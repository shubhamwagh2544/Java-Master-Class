package com.javamasterclass.multithreading;

/*
        priority : order in which thread executes

        - Highest :- 10
        - Lowest :- 1
        - Default :- 5
 */
class AThread extends Thread {
    @Override
    public void run() {
        System.out.println("A status:" + isAlive());
        for (int i = 1; i <= 5; i++) {
            System.out.println("A : " + i);
        }
    }
}

class BThread extends Thread {
    @Override
    public void run() {
        System.out.println("B status :"+ isAlive());
        for (int i = 1; i <= 5; i++) {
            System.out.println("B : " + i);
        }
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        AThread aThread = new AThread();
        BThread bThread = new BThread();

        aThread.setPriority(10);            //max:10
        bThread.setPriority(1);             //low:1

        aThread.start();
        bThread.start();
    }
}
