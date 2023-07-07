package com.javamasterclass.oops.polymorphism.method_overriding;

public class Parent {
    /*
            - private cant be overridden
            - we cant narrow down the access scope while overriding
            - final cant be overridden
            - instance method cant override static method (subclass instance method-same signature cant override parent static method)
            - static leads to method hiding (if called by dynamic polymorphism - parent static is called and not child - child is hidden)
              if specific child/parent reference of child/parent object calls -> that specific method is called
            - if parent method not present in child, then parent reference calls parent method (except private method)
     */
    void call1() {
        System.out.println("parent called");
    }
    private void call2() {} //cant override + cant be called parent reference(Parent parent = new Child())
    final void call3() {   //cant override + but called by parent reference
        System.out.println("parent final called");
    }
    static void call4() {
        System.out.println("parent called");
    }
    void call5() {
        System.out.println("parent unique method called");
    }
    protected void call6() {
        System.out.println("parent called");
    }
}
