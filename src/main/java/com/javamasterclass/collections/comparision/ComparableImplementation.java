package com.javamasterclass.collections.comparision;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@AllArgsConstructor
@Getter
@ToString
/*
        Comparable : compareTo()
        - to define natural ordering of class => sort objects
        - provides default comparison logic for class which is intrinsic to class itself
        - we can compare one instance of this class with another instance of same class
 */
class Employee implements Comparable<Employee> {

    private String name;
    private Integer age;

    @Override
    public int compareTo(Employee o) {
        return this.getAge().compareTo(o.getAge());
    }
}

public class ComparableImplementation {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee("Shubham", 25));
        list.add(new Employee("Ramesh", 52));
        list.add(new Employee("Jayashri", 48));
        list.add(new Employee("Tushar", 28));

        System.out.println(list);       //maintains insertion order

        //ordering
        Collections.sort(list);         //default comparable implementation for ordering Employee objects
        System.out.println(list);

        //reverse using comparator
        Collections.sort(list, Comparator.reverseOrder());  //Comparator.reverseOrder()
        System.out.println(list);
    }
}
