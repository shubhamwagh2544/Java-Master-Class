package com.javamasterclass.nonaccessmodifiers;

public class Final {

    public static final String NAME = "Shubham Wagh";

    public static void main(String[] args) {
        /*
                Final Keyword
                - to create constant
                - to prevent inheritance
                - to prevent method overriding

                Good way to create constant :
                public static final : declare at class level
         */
        System.out.println(NAME);
    }
}
