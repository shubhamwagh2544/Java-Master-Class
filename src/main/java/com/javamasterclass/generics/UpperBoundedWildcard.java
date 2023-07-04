package com.javamasterclass.generics;

import java.util.List;

public class UpperBoundedWildcard {

    public static void print(List<Double> list) {
        list.forEach(System.out::println);
    }
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 3, 4);
        List<Double> list1 = List.of(1.2, 1.3, 1.4);

        //print(list);  // compile time error :> incompatible type integer to double OR double to integer
        print(list1);

        //works
        printAnotherUnbounded(list);
        printAnotherUnbounded(list1);

        //works
        printAnotherUpperBounded(list);
        printAnotherUpperBounded(list1);
    }

    public static void printAnotherUnbounded(List<?> list) {
        list.forEach(System.out::println);
    }

    public static void printAnotherUpperBounded(List<? extends Number> list) {
        list.forEach(System.out::println);
    }
}
