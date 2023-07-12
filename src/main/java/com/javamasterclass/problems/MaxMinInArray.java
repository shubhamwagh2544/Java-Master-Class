package com.javamasterclass.problems;

import java.util.Arrays;

public class MaxMinInArray {
    private static void findMinMax(int[] array) {
        Arrays.sort(array);
        System.out.println("Min : " + array[0]);
        System.out.println("Max : " + array[array.length-1]);
    }

    private static void findMinMaxAnother(int[] array) {
        int max=Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int el : array) {
            max = Math.max(el, max);
            min = Math.min(el, min);
        }
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 3, 4, 1};
        findMinMax(array);
        findMinMaxAnother(array);
    }
}
