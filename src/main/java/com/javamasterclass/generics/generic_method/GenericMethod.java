package com.javamasterclass.generics.generic_method;

public class GenericMethod {

    public static void main(String[] args) {
        String[] strings = {"shubham", "ramesh", "wagh"};
        Character[] character = {'A', 'B', 'C'};
        Integer[] integers = {10, 20, 30};

        printAnyType(strings);
        printAnyType(character);
        printAnyType(integers);
    }

    private static <T> void printAnyType(T[] array) {
        for (T t : array) {
            System.out.println(
                    t.getClass().getName() + " : " + t
            );
        }
    }
}
