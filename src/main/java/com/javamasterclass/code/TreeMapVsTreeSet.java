package com.javamasterclass.code;

import javax.management.InstanceNotFoundException;
import java.util.*;

public class TreeMapVsTreeSet {
    public static void main(String[] args) {
        //map
        TreeMap<Integer, String> treeMap = new TreeMap<>();         //keys in sorted order
        treeMap.put(3, "wagh");
        treeMap.put(2, "ramesh");
        treeMap.put(1, "shubham");

        System.out.println(treeMap);

        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();       //maintain insertion order
        linkedHashMap.put(3, "wagh");
        linkedHashMap.put(2, "ramesh");
        linkedHashMap.put(1, "shubham");

        System.out.println(linkedHashMap);

        HashMap<Integer, String> hashMap = new HashMap<>();     // no insertion order
        hashMap.put(3, "wagh");
        hashMap.put(2, "ramesh");
        hashMap.put(1, "shubham");

        System.out.println(hashMap);

        //set
        TreeSet<Integer> treeSet = new TreeSet<>();         //sorted keys
        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(1);

        System.out.println(treeSet);

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();       //maintain insertion order
        linkedHashSet.add(3);
        linkedHashSet.add(2);
        linkedHashSet.add(1);

        System.out.println(linkedHashSet);

        HashSet<Integer> hashSet = new HashSet<>();                 //no insertion order
        hashSet.add(3);
        hashSet.add(2);
        hashSet.add(1);

        System.out.println(hashSet);
    }
}
