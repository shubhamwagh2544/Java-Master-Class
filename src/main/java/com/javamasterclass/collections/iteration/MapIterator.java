package com.javamasterclass.collections.iteration;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIterator {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "shubham");
        map.put(2, "ramesh");
        map.put(3, "wagh");

        //1
        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //2
        Iterator<String> iterator1 = map.values().iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        //3
        Iterator<Map.Entry<Integer, String>> iterator2 = map.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<Integer, String> entry = iterator2.next();

            Integer key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + " : " + value);
        }

        //4
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + " : " + value);
        }
    }
}
