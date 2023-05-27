package com.javamasterclass.generics.generic_method;

import java.util.Arrays;
import java.util.List;

public class LowerBoundedWildcards {
    public static void main(String[] args) {
        //super :> any Type that is super class/interface to Integer
        List<Integer> list1 = Arrays.asList(10, 20, 30);
        List<Number> list2 = Arrays.asList();

        print(list1);
        print(list2);
    }
    private static void print(List<? super Integer> list) {     //Integer or its parent class
        list.forEach(e -> {
            System.out.println(
                    e.getClass().getName() + " : " + e
            );
        });
    }
}
