package com.javamasterclass.aceessmodifiers.private_mod;

public class MainPrivate {

    private static String name = "shubham wagh";        // private only accessible in the same class

    private static void sayName() {
        System.out.println(name);
    }

    private static void main(String[] args) {
        System.out.println(name);
    }
}
