package com.javamasterclass.code;

/*
        - class can be abstract without any abstract method inside
        - but if any abstract method inside, class has to be abstract
 */
abstract class Test {
    static void sayHi() {
        System.out.println("hi static");
    }
    void sayHello() {
        System.out.println("separate method - says hello");
    }
    public void call() {
        System.out.println("inside abstract class");
    }
}
/*
        - overridden method - cannot narrow down access -
        - private method cant override (but can have same method in subclass -
                                        which is totally diff from parent one & separate method of subclass only)
 */
public class TestAbstract extends Test {

    public void call() {
        System.out.println("overridden method");
    }

    public static void main(String[] args) {
        Test test = new TestAbstract();
        test.call();            //abstract class's -> non-abstract overridden method

        test.sayHi();           //abstract class's -> static method

        test.sayHello();        //abstract class's -> non-abstract separate method
    }
}
