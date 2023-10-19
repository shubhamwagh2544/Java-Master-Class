package com.javamasterclass.code;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTraversal {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Shubham");
        map.put(2, "Ramesh");
        map.put(3, "Wagh");

        //1: keyset + java 5 loops
        for (Integer key : map.keySet()) {
            System.out.println("Key : " + key + " | " + "Value : " + map.get(key));
        }

        //2: keyset + iterator
        Set<Integer> keySet = map.keySet();
        Iterator<Integer> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Integer keyNext = iterator.next();
            System.out.println("Key : " + keyNext + " | " + "Value : " + map.get(keyNext));
        }

        //3: Entry Object + java 5 loops
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey() + " | " + "Value : " + entry.getValue());
        }

        //4: Entry object + iterator
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        Iterator<Map.Entry<Integer, String>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<Integer, String> entryNext = entryIterator.next();
            System.out.println("Key : " + entryNext.getKey() + " | " + "Value : " + entryNext.getValue());
        }
    }
}
