package com.javamasterclass.oops.polymorphism.method_overriding;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Child();
        //example of runtime polymorphism
        parent.call1();
        //final method called by parent reference
        parent.call3();
        //Method hiding through runtime polymorphism
        parent.call4();
        //parent unique method is called by parent reference (if same method not present in subclass)
        parent.call5();

        //No method hiding scenario
        Child child = new Child();
        child.call4();
        Parent parent1 = new Parent();
        parent1.call4();
    }
}
