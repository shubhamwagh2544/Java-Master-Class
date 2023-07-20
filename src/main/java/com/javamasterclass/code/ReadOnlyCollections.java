package com.javamasterclass.code;

import java.util.*;


public class ReadOnlyCollections {

    private static void unmodifiableList() throws UnsupportedOperationException {
        List<String> list = new ArrayList<>();
        list.add("Shubham");
        list.add("Ramesh");
        list.add("Wagh");

        //1. Collections.unmodifiableList()
        List<String> unmodifiableList = Collections.unmodifiableList(list);

        //UnSupportedOperationException
        unmodifiableList.add("temp");


        //2. List.of() => makes Immutable Collection
        List<Integer> list1 = List.of(1, 2, 3, 4, 5);

        //UnSupportedOperationException
        list1.add(6);


        //3. Collections.singletonList() => takes only single object
        String singleElement = "Shubham Wagh";
        List<String> list2 = Collections.singletonList(singleElement);

        //UnSupportedOperationException
        list2.add("temp");
    }

    private static void unmodifiableMap() throws UnsupportedOperationException {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Shubham");
        map.put(2, "Ramesh");
        map.put(3, "Wagh");

        //1. Collections.unmodifiableMap()
        Map<Integer, String> unmodifiableMap = Collections.unmodifiableMap(map);

        //UnSupportedOperationException
        unmodifiableMap.put(1, "temp");


        //2. Collections.singletonMap() => takes single object key, object value
        Map<Integer, String> map1 = Collections.singletonMap(1, "Shubham");

        //UnSupportedOperationException
        map1.put(2, "Wagh");


        //3. Map.of() => makes Immutable Collection
        Map<Integer, String> map2 = Map.of(1, "Shubham", 2, "Ramesh", 3, "Wagh");

        //UnSupportedOperationException
        map2.put(2, "Wagh");
    }

    private static void unmodifiableSet() throws UnsupportedOperationException {
        Set<String> set = new HashSet<>();
        set.add("Shubham");
        set.add("Ramesh");
        set.add("Wagh");

        //1. Collections.unmodifiableSet()
        Set<String> unmodifiableSet = Collections.unmodifiableSet(set);

        //UnSupportedOperationException
        unmodifiableSet.add("temp");


        //2. Collections.singleton() => takes single object only
        Set<String> set1 = Collections.singleton("shubham wagh");

        //UnSupportedOperationException
        set1.add("temp");


        //3. Set.of() => makes Immutable Collection
        Set<Integer> set2 = Set.of(1, 2, 3);

        //UnSupportedOperationException
        set2.add(2);
    }

    public static void main(String[] args) {
        try {
            unmodifiableList();
            unmodifiableMap();
            unmodifiableSet();
        }
        catch (UnsupportedOperationException e) {
            System.out.println("oops! we ran into exception");
        }
    }
}
