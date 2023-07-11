package com.javamasterclass.problems;

public class SwapWithoutThird {
    private static void swapWithThird(int one, int two) {
        int third = two;
        two = one;
        one = third;

        System.out.println("one: " + one + " & two: " + two);
    }
    private static void swap(int one, int two) {
        //XOR operator          // [0 xor 0 = 0], [1 xor 1 = 0], [0 xor 1 = 1], [1 xor 0 = 1]
        one = one ^ two;
        two = one ^ two;
        one = one ^ two;

        System.out.println("one: " + one + " & two: " + two);
    }

    private static void swapAnother(int one, int two) {
        //Multiplication
        one = one * two;    // 200
        two = one / two;    // 200 / 20 = 10
        one = one / two;    // 200 / 10 = 20

        System.out.println("one: " + one + " & two: " + two);
    }

    public static void main(String[] args) {
        int one = 10;
        int two = 20;
        System.out.println("Before Swapping\none: " + one + " & two: " + two +"\nAfter Swapping");

        swapWithThird(one, two);
        swap(one, two);
        swapAnother(one, two);
    }
}
