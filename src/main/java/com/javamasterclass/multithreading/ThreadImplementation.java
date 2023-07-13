package com.javamasterclass.multithreading;

/*
        achievements:
        - direct control over thread's behaviour
        - since extends Thread - All Thread properties and methods are now applicable to Custom Thread class
        - encapsulated thread behaviour and implementation in single class

        drawbacks:
        - since extends is used - inheritance is limited (single inheritance only)
        - if extends other class - then cannot extend Thread OR if extends Thread - then cannot extend other class
*/
public class ThreadImplementation extends Thread {  //ThreadImplementation is itself thread now

    @Override
    public void run() {                             //overriding run method to define thread's behaviour
        System.out.println("threadone running");
    }

    public static void main(String[] args) {
        ThreadImplementation thread
                = new ThreadImplementation();       //creating instance of custom thread
        thread.start();                             //starting it as separate thread using start()
    }
}
