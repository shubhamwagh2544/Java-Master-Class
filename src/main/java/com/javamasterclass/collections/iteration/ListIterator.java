package com.javamasterclass.collections.iteration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("shubham");
        list.add("ramesh");
        list.add("wagh");

        //1
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {                    // only next method
            System.out.println(iterator.next());
        }

        //2
        for (String name : list) {
            System.out.println(name);
        }

        //3
        java.util.ListIterator<String> listIterator = list.listIterator(1);     //iterator implementation for list
        while (listIterator.hasNext()) {                    //has next and previous methods
            System.out.println(listIterator.next());
        }

        //4
        for (String name : list) {
            if (name.equals("wagh")) {
                //list.remove("wagh");            //ConcurrentModificationException -> fail fast mechanism
            }
        }
        //advised to use Iterator.remove() method to avoid concurrent modification exception

        Iterator<String> iterator1 = list.iterator();
        while (iterator1.hasNext()) {
            String name = iterator1.next();
            if (name.equals("wagh")) {
                iterator1.remove();
            }
            else {
                System.out.println(name);
            }
        }
    }
}
