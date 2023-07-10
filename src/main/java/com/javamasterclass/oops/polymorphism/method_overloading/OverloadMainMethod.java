package com.javamasterclass.oops.polymorphism.method_overloading;

public class OverloadMainMethod {
    /*
            since main is static -> we can overload it (static is resolved at compile time - overloading is compile time polymorphism)
            since main is static -> we can't override it (object/instance info is resolved at runtime VS static resolved at compile time)
     */
    public static void main(String args) {

    }

    public static void main(Character[] args) {

    }

    public static void main(Boolean args) {

    }

    public static void main(String[] args) {
        System.out.println("main method");
    }
}
