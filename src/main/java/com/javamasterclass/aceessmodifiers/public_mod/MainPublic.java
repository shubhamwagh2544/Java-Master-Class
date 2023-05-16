package com.javamasterclass.aceessmodifiers.public_mod;

import java.util.Arrays;

public class MainPublic {

    public static String name = "shubham wagh";         // public accessible everywhere in project

    public static void sayName() {
        System.out.println("My name is " + name);
    }

    public static void main(String[] args) {
        if (args.length != 0) {
            Arrays.stream(args).forEach(System.out::println);
        }
        System.out.println(name);
        System.out.println("Inside MainPublic");
    }
}
