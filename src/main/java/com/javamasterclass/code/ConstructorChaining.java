package com.javamasterclass.code;

class OneClass {
    public OneClass() {
        this("message in superclass");      //this should be on first line in constructor chaining
    }
    public OneClass(String message) {
        System.out.println(message);
        System.out.println("SuperClass called");
    }
}
public class ConstructorChaining extends OneClass {

    public ConstructorChaining() {
        super();            //super() should be on first line in constructor chaining

        //super() calls default constructor of superclass
        //super("message") calls parametrized constructor of superclass

        System.out.println("SubClass called");
    }

    public static void main(String[] args) {
        OneClass oneClass = new ConstructorChaining();      //dynamic polymorphism
    }
}
