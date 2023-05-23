package com.javamasterclass.oops.abstraction;

public class Implementor implements Interface {             // must override the abstract methods
    @Override
    public void sayHi() {
        System.out.println("Greetings To " + Interface.NAME);
    }
    @Override
    public void sayHello() {
        System.out.println("Greeting To " + Interface.NAME);
    }

    public static void main(String[] args) {
        Implementor implementor = new Implementor();
        implementor.greet();        // calling default method (if interface is implemented)
        implementor.sayHi();        // overridden method
        implementor.sayHello();     // overridden method
    }
}
