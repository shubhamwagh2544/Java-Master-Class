package com.javamasterclass.oops.abstraction;

public class Implementor2 implements Interface {
    @Override
    public void sayHi() {
        System.out.println("overridden sayHi");
    }

    @Override
    public void sayHello() {
        System.out.println("overridden sayHello");
    }

    @Override
    public void greet() {
        Interface.super.greet();        //can override default method
        //own implementation
        System.out.println("Own Logic Inside Default Interface Method");
    }

    public void greet(int a) {
        //this is overridden default interface method
    }

    public void greet(boolean bool) {
        //this is overridden abstract interface method
    }


    public static void main(String[] args) {
        String name = Interface.NAME;           //static prop accessible
        Interface.sayMyName2();                 //static method accessible

        Interface in = new Implementor2();
        in.greet();         //overriding default interface method
    }
}
