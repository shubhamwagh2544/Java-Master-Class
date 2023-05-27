package com.javamasterclass.generics;

import java.util.ArrayList;
import java.util.List;

public class ClassCastException {
    public static void main(String[] args) {
        //example 1
        List list = new ArrayList();

        list.add(1);
        list.add("shubham");
        list.add("ramesh");

        for (Object object : list) {
            //System.out.println((String) object);        // ClassCastException
        }

        //example 2
        Comparable number = 10;
        //number.compareTo("Shubham");                // ClassCastException

        //solutions
        //1
        List<String> list1 = new ArrayList<>();
        list1.add("1");
        //list1.add(2);             CE : Required Type String ; Provided Type Int
        list1.add("shubham");
        System.out.println(list1);

        //2
        Comparable<Integer> number1 = 10;
        System.out.println(number1.compareTo(20));      // -1
    }
}
