package com.javamasterclass.collections.iteration;

import java.util.Enumeration;
import java.util.Vector;

/*
        Enumeration :
        - legacy interface
        - Enumeration can only traverse legacy collections (Vector, Hashtable, Properties)
        - no remove() method (no modify)
        - not fail-fast
 */
public class EnumerationExample {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

        vector.add(1);
        vector.add(2);
        vector.add(3);

        Enumeration<Integer> enumeration = vector.elements();

        while (enumeration.hasMoreElements()) {
            Integer nextElement = enumeration.nextElement();
            System.out.println(nextElement);
        }
    }
}
