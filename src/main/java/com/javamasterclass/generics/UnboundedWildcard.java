package com.javamasterclass.generics;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildcard {        // ?
    public static void print(List<?> list) {
        list.forEach(System.out::println);
    }
    public static void main(String[] args) {
        List<String> list = List.of("shubham", "ramesh", "wagh");
        List<Number> list1 = List.of(1, 2, 1.2, 55, -42, 12.431413431, 0);

        print(list);
        print(list1);
    }
}
