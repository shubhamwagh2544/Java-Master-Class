package com.javamasterclass.problems;

public class Fibonacci {
    private static void getFibonacci(int n) {
        int first = 0;
        int second = 1;
        System.out.print(first+ " " + second+" ");
        int third;

        for (int i = 2; i < n; i++) {
            third = first + second;
            System.out.print(third+" ");
            first = second;
            second = third;
        }
    }

    public static void main(String[] args) {
        getFibonacci(10);
    }
}
