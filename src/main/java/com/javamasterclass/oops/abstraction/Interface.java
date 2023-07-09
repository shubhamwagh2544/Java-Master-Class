package com.javamasterclass.oops.abstraction;

public interface Interface {
    // constants
    public static String NAME = "SHUBHAM_WAGH";         // no need of public static

    // abstract methods
    public abstract void sayHi();                       // no need of public abstract
    void sayHello();
    void greet(boolean bool);       //public abstract

    // default methods
    public default void greet() {                       // no need of public
        System.out.println("Default: Greetings to " + NAME);
    }
    public default void greet(int a) {
        System.out.println("Default: Greetings to " + NAME);
    }

    //static methods
    private static void sayMyName() {
        System.out.println("static of interface");
    }
    public static void sayMyName2() {
        System.out.println("static of interface");
    }
}
