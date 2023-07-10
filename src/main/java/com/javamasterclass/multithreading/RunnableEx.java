package com.javamasterclass.multithreading;

public class RunnableEx {
    /*
            Runnable - functional interface which allows to execute tasks in parallel / concurrently
                     - void run()
                     - do not return value / result
                     - do not throw exception
     */
    public static void main(String[] args) {

        Runnable runnable = () -> {
            System.out.println("runnable example");
        };

        runnable.run();
    }

}
