package com.javamasterclass.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericExercise1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(10);       // we know that we passed integer

        Object next = list.iterator().next();   // iterator().next() will return object
        System.out.println(next);

        Integer x = (Integer) list.iterator().next(); // to be clear needs to cast to integer
        System.out.println(x);      // to ensure assignment is safe (no runtime error - Class Cast Exception)
        // this casting brings clutter and confusion.

        list.add("shubham");

        for (Object o : list) {
            System.out.println((String) o);     // will generate Class Cast Exception
        }

        //solution
        //explicitly mention the type using generics
        List<String> list1 = new ArrayList<>();
        list1.add("shubham");

        list1.forEach(System.out::println);

        //Compiler will give error : Required type Object | Provided type String
        /* List<Object> list2 = list1; */
       //even if string is type of object, we can't assign one over another in generics
        //hence generics provides type safety at compile time

    }
}
