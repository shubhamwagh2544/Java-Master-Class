package com.javamasterclass.collections.queues;

import java.util.LinkedList;
import java.util.Queue;

public class TheQueues {
    /*
            What is Queue :
            : First In First Out (FIFO) queue of objects
            : designed for holding elements prior to processing
     */
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();

        queue.add(new Person("Shubham", 25));
        queue.add(new Person("Ramesh", 52));
        queue.add(new Person("Jayashri", 45));

        System.out.println(queue);
        System.out.println(queue.peek());       // FI
        System.out.println(queue.poll());       // FO
        System.out.println(queue.size());
        System.out.println(queue.peek());
    }

    record Person(String name, int age) {}
}
