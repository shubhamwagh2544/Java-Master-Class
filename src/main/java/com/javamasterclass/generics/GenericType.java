package com.javamasterclass.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericType {
    public static void main(String[] args) {
        List<Diamond> diamondList = new ArrayList<>();

        diamondList.add(new Diamond("Indian Diamond"));     // List of Type Diamond
        diamondList.add(new Diamond("African Diamond"));

        System.out.println(diamondList);
    }
    record Diamond(String name) {}
}
