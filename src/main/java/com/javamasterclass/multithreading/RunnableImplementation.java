package com.javamasterclass.multithreading;

/*
        achievements:
        - separation of thread behaviour from actual thread implementation
        - better code organization and separation of concerns
        - only need to implement run() and no Thread props and methods are inherited - sole purpose of defining thread behaviour
        - can inherit any other class or implement any other interface - flexibility, modularity achieved
 */
class RunnableImpl implements Runnable {                    //RunnableImpl is runnable instance
    @Override
    public void run() {                                     //overriding run() to define thread's behaviour
        System.out.println("thread is running");
    }
}

public class RunnableImplementation {
    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableImpl());     //passing runnable instance to Thread object
        thread.start();                                     //starting thread
    }
}