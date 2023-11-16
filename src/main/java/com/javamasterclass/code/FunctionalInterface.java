package com.javamasterclass.code;

@java.lang.FunctionalInterface
interface Functional {

    //Object class's overridden methods are not considered SAM in FI.
    String toString();  //no compilation error but is NOT SAM

    void call();        //valid SAM

    //void make();      //compilation error : cannot have more than one SAM

    default void say() {}       // can have default methods
    static void sayAgain() {}   // can have static methods
}
public class FunctionalInterface implements Functional {
    @Override
    public void call() {
        //must override
    }

    @Override
    public void say() {
        //optional override
        Functional.super.say();     //way to call Interface's default method
    }

    public static void main(String[] args) {

    }
}
