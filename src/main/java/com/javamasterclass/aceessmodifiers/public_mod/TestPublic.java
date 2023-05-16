package com.javamasterclass.aceessmodifiers.public_mod;

public class TestPublic {
    public static void main(String[] args) {
        System.out.println(MainPublic.name);
        MainPublic.sayName();

        // calling public main method
        MainPublic.main(new String[]{"shubham", "ramesh", "wagh"});
    }
}
