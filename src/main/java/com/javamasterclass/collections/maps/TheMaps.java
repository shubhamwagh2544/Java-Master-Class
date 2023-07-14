package com.javamasterclass.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class TheMaps {
    /*
            What is Map :
            : key-value pair that does not allow duplicate keys
            : each key can contain at most one value
     */
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("shubham"));
        map.put(2, new Person("ramesh"));
        map.put(3, new Person("wagh"));

        System.out.println(map.size());
        System.out.println(map);

        // no duplicate key allowed
        map.put(3, new Person("jayashri"));     // key 3 updated with recent put
        System.out.println(map.get(3));

        map.remove(3);              // success : return removed person
        map.remove(4);              // failure : return null person

        System.out.println(map.containsKey(4));     // false
        System.out.println(map.keySet());
        System.out.println(map.values());

        System.out.println(map.entrySet());

        //iteration
        map.entrySet().forEach(record -> {
            System.out.println(record.getKey() + " : " + record.getValue());
        });

        map.forEach(((integer, person) -> {
            System.out.println(integer + " : " + person.name());
        }));

        System.out.println(map.getOrDefault(3, new Person("default-name")));    //if present -> get or get default

    }

    record Person(String name) {}
}