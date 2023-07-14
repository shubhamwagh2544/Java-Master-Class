package com.javamasterclass.generics.generic_method;

public class BoundedTypeParameter {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3};
        System.out.println(printTheCount(numbers, 2));
    }
    private static <T extends Comparable<T>> int printTheCount(T[] numbers, T number) {
        int count = 0;
        for (T n : numbers) {
            //if (n > number) {       // n > number ( > operator cannot be applied to T ) Hence to compare, we need T to extend ComparableImplementation
            if (n.compareTo(number) > 0) {
                count++;
            }
        }
        return count;
    }
}
