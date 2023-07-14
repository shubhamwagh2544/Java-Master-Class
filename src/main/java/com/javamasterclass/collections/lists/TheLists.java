package com.javamasterclass.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class TheLists {
    /*
            What is List
            : ordered collection or sequence
            : allows duplicates
            : dynamic size (not fixed size like arrays)
            : fast for data retrievals
            : various implementations :> arraylist, stack, vector

            : initial capacity :> 10
            : list is concrete implementation based on array
            : grow() is called when capacity increases :> whole array is copied into new array
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("blue");
        list.add("green");
        list.add("red");
        list.add("yellow");

        System.out.println(list);

        //stream
        list.forEach(System.out::println);

        //for i
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //enhanced for
        for (String color : list) {
            System.out.println(color);
        }

    }
}
