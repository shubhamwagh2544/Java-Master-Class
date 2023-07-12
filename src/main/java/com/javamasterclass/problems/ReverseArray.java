package com.javamasterclass.problems;

import java.util.Arrays;

public class ReverseArray {
    private static void reverseArrayInPlace(int[] array) {
        int start = 0;
        int end = array.length-1;

        while (start <= end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        reverseArrayInPlace(array);
    }
}
