package com.javamasterclass.collections.comparision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
        Sort Collection
        - comparable interface => compareTo() => defines default natural ordering
        - comparator interface => compare() =>

        For Wrapper classes
        - Collections are sorted in natural order => Comparable
        - we can reverse order using Comparator.reverseOrder()

        For User Defined classes
        - we can implement Comparable or Comparator to define ordering for custom class objects

        1. Comparable => define default comparison logic for natural ordering of same class
        2. Comparator => define custom comparison logic for custom ordering of same or different class
 */
public class SortingUsingComparison {
    private static void stringSortingUsingComparison() {
        List<String> listString = new ArrayList<>();
        listString.add("shubham");
        listString.add("ramesh");
        listString.add("wagh");

        //comparable way
        Collections.sort(listString);       //default implements Comparable to define natural ordering
        System.out.println(listString);

        //comparator way
        Collections.sort(listString, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(listString);

        //comparator reverse way
        Collections.sort(listString, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return ~(o1.compareTo(o2));
            }
        });
        System.out.println(listString);

        //another comparator reverse way
        Collections.sort(listString, Comparator.reverseOrder());
        System.out.println(listString);
    }

    private static void integerSortingUsingComparison() {
        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(10);
        listInteger.add(30);
        listInteger.add(20);

        //comparable way
        Collections.sort(listInteger);       //default implements Comparable to define natural ordering
        System.out.println(listInteger);

        //comparator way
        Collections.sort(listInteger, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(listInteger);

        //comparator reverse way
        Collections.sort(listInteger, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return ~(o1.compareTo(o2));
            }
        });
        System.out.println(listInteger);

        //another comparator reverse way
        Collections.sort(listInteger, Comparator.reverseOrder());
        System.out.println(listInteger);
    }

    public static void main(String[] args) {
        stringSortingUsingComparison();
        integerSortingUsingComparison();
    }
}
