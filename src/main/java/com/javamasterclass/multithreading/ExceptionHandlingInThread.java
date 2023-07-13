package com.javamasterclass.multithreading;

//way 1 - try catch block
class ThreadExOne extends Thread {
    public ThreadExOne(String name) {
        super(name);
    }
    @Override
    public void run() {
        try {
            System.out.println(currentThread() + " is running");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

//way 2 - unCaughtException() - UncaughtExceptionHandler interface
class ThreadExTwo extends Thread {
    @Override
    public void run() {
        System.out.println(currentThread() + " is running");

        // Set an uncaught exception handler for the thread
        /*
            either pass as lambda : UncaughtExceptionHandler is Functional Interface
            UncaughtExceptionHandler handler = (Thread t, Throwable e) -> {
                // Exception handling logic
            };
        */
        Thread.currentThread().setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                // Exception handling logic
            }
        });

        //thread code that may throw exception
    }
}

public class ExceptionHandlingInThread {
    public static void main(String[] args) {
        ThreadExOne threadExOne = new ThreadExOne("thread-one");    //[custom name : thread-one]
        threadExOne.start();

        ThreadExTwo threadExTwo = new ThreadExTwo();                     //[default name : Thread-0]
        threadExTwo.start();
    }
}
