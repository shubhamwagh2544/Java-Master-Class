package com.javamasterclass.code;

import java.util.Scanner;

public class StringInSwitch {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        switch (s) {
            case "shubham" : {
                System.out.println("hey");
                System.out.println(s);
                break;
            }
            case "ramesh" : {
                System.out.println("hey there");
                System.out.println(s);
                break;
            }
            case "wagh" : {
                System.out.println("hello");
                System.out.println(s);
                break;
            }
        }
    }
}
