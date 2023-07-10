package com.javamasterclass.multithreading;

import java.util.concurrent.Callable;

public class CallableEx {
    /*
            Callable - functional interface which allows to execute tasks in parallel / concurrently
                     - V call() throws Exception (returns type V)
                     - return value / result
                     - throws exception
     */
    public static void main(String[] args) throws Exception {       //throws exception
        Callable<String> callable = () -> {
            return "callable example";
        };

        String result = callable.call();

        System.out.println(result);
    }

}
