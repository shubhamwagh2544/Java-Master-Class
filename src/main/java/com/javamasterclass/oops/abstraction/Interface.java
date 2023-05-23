package com.javamasterclass.oops.abstraction;

public interface Interface {
    // constants
    public static String NAME = "SHUBHAM_WAGH";         // no need of public static

    // abstract methods
    public abstract void sayHi();                       // no need of public abstract
    void sayHello();

    // default methods
    public default void greet() {                       // no need of public
        System.out.println("Default: Greetings to " + NAME);
    }
}
