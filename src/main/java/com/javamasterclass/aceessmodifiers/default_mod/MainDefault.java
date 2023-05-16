package com.javamasterclass.aceessmodifiers.default_mod;

public class MainDefault {

    static String name = "shubham wagh";        // default accessible in same package : also called package-private
    private static String firstName = "shubham";
    public static String lastName = "wagh";

    public static void main(String[] args) {
        System.out.println(name);
    }
}

// default will only be accessed by the classes in the same package only "com.javamasterclass.aceessmodifiers.default_mod"
