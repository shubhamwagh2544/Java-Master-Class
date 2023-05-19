package com.javamasterclass.intro.javaispassbyvalue;

public class PassByValueWithPrimitive {

    public static void main(String[] args) {
        // pass by value with primitive
        int age = 21;       // put onto stack
        int ageCopy = increment(age);
        System.out.println(age);            // still 21   :> means java is pass by value for primitive
        System.out.println(ageCopy);        // becomes 22
    }

    private static int increment(int age) {
        return ++age;
    }
}
