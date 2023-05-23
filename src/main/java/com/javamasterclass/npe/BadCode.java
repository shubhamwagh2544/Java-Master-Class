package com.javamasterclass.npe;

import java.util.Objects;

public class BadCode {
    public static void main(String[] args) {
        String name = null;

        //way 1
        if (name == null) {
            System.out.println("String cannot be null");
        }
        else {
            System.out.println(name.toUpperCase());
        }

        //way 2
        try {
            System.out.println(name.toUpperCase());
        }
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        //way 3
        printUpperCase(name);

    }

    private static void printUpperCase(String name) {
        Objects.requireNonNull(name, "String cannot be null");
        System.out.println(name.toUpperCase());
    }
}
