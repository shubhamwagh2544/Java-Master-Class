package com.javamasterclass.oops.polymorphism.method_overloading;

import java.time.LocalDate;
import java.util.Date;

public class Overload {
    void call(int a) {}
    void call(String str) {}
    void call(int a, String str) {}
    String call() {return "temp";}   // parameter list should be different from earlier method versions
    private void call(char c) {}    // can have any access modifier, non-access modifier, just different parameters
    private static void call(double d) {}
    private final void call(LocalDate localDate) {}
    private static final void call(boolean bool) {}


    public static void main(String[] args) {
        Overload overload = new Overload();
        overload.call(10);
        overload.call("temp");
        overload.call(10, "temp");
        System.out.println(overload.call());
        overload.call('a');
        overload.call(1.2345);      //static method can be called through instance
        overload.call(false);
        overload.call(LocalDate.now());
    }
}
