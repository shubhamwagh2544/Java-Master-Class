package com.javamasterclass.code;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SplitIteratorImplementation {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>(
                List.of("Shubham", "Ramesh", "Wagh", "Dashrath", "Jayashri", "Tushar")
        );

        Spliterator<String> spliterator = words.spliterator();

        Spliterator<String> secondHalf = spliterator.trySplit();

        spliterator.forEachRemaining(System.out::println);
        System.out.println("--------------------------------------------------------");
        secondHalf.forEachRemaining(System.out::println);
    }
}
