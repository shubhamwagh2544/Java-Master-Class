package com.javamasterclass.multithreading;

public class MainThread {

    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();

        System.out.println(mainThread);             // [name, priority, parent]

        System.out.println(mainThread.getName());       //name
        System.out.println(mainThread.getId());
        System.out.println(mainThread.getPriority());   //priority - default priority is 5 [MIN=1, MAX=10]
        System.out.println(mainThread.getState());
        System.out.println(mainThread.isAlive());
    }

}
