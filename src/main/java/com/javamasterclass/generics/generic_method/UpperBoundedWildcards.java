package com.javamasterclass.generics.generic_method;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class UpperBoundedWildcards {
    public static void main(String[] args) {
        //we have made Type more specific (Number) :> any Type that extends Number
        List<Double> list = Arrays.asList(1.2, 3.4, 5.5);
        List<Integer> list1 = Arrays.asList(10, 20, 30);
        List<Number> list2 = Arrays.asList();

        print(list);
        print(list1);
        print(list2);
    }
    private static void print(List<? extends Number> list) {
        list.forEach(e -> {
            System.out.println(
                    e.getClass().getName() + " : " + e
            );
        });
    }
}
