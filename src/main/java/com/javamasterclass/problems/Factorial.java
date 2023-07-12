package com.javamasterclass.problems;

public class Factorial {
    private static void getFactorial(int number) {
        int factorial = 1;
        while (number > 0) {
            factorial = factorial * number;
            number--;
        }
        System.out.println(factorial);
    }

    private static int getFactorialRecursion(int number) {
        if (number > 0) {
            return number * getFactorialRecursion(number-1);
        }
        return 1;
    }

    public static void main(String[] args) {
        int number = 5;
        getFactorial(number);
        System.out.println(getFactorialRecursion(number));
    }
}
