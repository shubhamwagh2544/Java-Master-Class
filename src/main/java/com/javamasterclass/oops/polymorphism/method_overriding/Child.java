package com.javamasterclass.oops.polymorphism.method_overriding;

public class Child extends Parent {
    void call1() {
        //super.call(); // parent call method is invoked with super
        System.out.println("child called");
    }
    static void call4() {
        System.out.println("child called");
    }

    protected void call6() {                // scope cant be less than protected i.e. private and default -> we can use protected + public
        System.out.println("child called");
    }
    public void call6(int a) {          // we can overload the overridden method
        System.out.println("call6 method overloaded");
    }
}
