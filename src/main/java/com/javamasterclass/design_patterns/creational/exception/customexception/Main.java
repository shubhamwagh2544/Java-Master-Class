package com.javamasterclass.design_patterns.creational.exception.customexception;

public class Main {
    /*
            can be
            - handled by adding throws signature to method
            - handled by surrounding with try-catch
     */
    public static void main(String[] args) {
        try {
            System.out.println(divide(10, 0));
        } catch (MyUnCheckedException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        try {
            System.out.println(getArrayElement(5));
        } catch (MyCheckedException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

    private static int getArrayElement(int i) throws MyCheckedException{
        int[] array = {1, 2, 3};
        if (i >= array.length) {
            throw new MyCheckedException("Array Index cannot be greater or equal to ArrayLength");
        }
        return array[i];
    }

    private static int divide(int a, int b) throws MyUnCheckedException {
        if (b == 0) {
            throw new MyUnCheckedException("Cannot divide by zero");
        }
        return a/b;
    }
}
