package com.javamasterclass.generics.generic_method;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class UnBoundedWildcards {
    public static void main(String[] args) {
        List<Object> list = Arrays.asList(1, "sr", new Date());
        List<Integer> list1 = Arrays.asList(10, 20, 30);
        List<String> list2 = Arrays.asList("shubham", "ramesh", "wagh");

        print(list);
        print(list1);
        print(list2);
    }
    private static void print(/*List<Object>*/ List<?> list) {  //<Object> replaced with <?>
        list.forEach(e -> {
            System.out.println(
                    e.getClass().getName() + " : " + e
            );
        });
    }
}
