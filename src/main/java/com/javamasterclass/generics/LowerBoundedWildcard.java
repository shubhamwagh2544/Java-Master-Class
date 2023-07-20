package com.javamasterclass.generics;

import java.util.List;

public class LowerBoundedWildcard {     // ? super Integer
    public static void print(List<? super Integer> list) {
        list.forEach(System.out::println);
    }
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3);
        List<Number> list1 = List.of(1, 2, 1.2, 1.3, 0);

        print(list);
        print(list1);
    }

}
