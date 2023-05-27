package com.javamasterclass.data_structures.linked_lists;

import java.util.LinkedList;
import java.util.ListIterator;

public class TheLinkedLists {

    public static void main(String[] args) {
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("shubham", 25));
        linkedList.add(new Person("ramesh", 52));
        linkedList.add(new Person("jayashri", 47));

        ListIterator<Person> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " -> ");
        }
        System.out.println();
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
    record Person(String name, int age) {}
}
