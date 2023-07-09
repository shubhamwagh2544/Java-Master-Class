package com.javamasterclass.oops.abstraction;

public class Implementor1 implements Interface {             // must override the abstract methods
    @Override
    public void sayHi() {
        System.out.println("Greetings To " + Interface.NAME);
    }
    @Override
    public void sayHello() {
        System.out.println("Greeting To " + Interface.NAME);
    }

    @Override
    public void greet(boolean bool) {
        //override interface method
    }

    public static void main(String[] args) {
        Implementor1 implementor1 = new Implementor1();
        implementor1.greet();        // calling default method (if interface is implemented)
        implementor1.sayHi();        // overridden method
        implementor1.sayHello();     // overridden method
    }
}
