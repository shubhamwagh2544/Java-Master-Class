package com.javamasterclass.oops.polymorphism.method_overriding;

public class Main {
    //way to avoid method overriding -> declare as private or static or final (private/static/final cant be overridden)
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

        //exception
        parent.call7();

        //private methods of parent/child - call8() cant be called here through any object
        //even if declare same private method as of parent in subclass - then its complete different method - not override of parent
    }
}
