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
        Comparator: compare()
        - implemented separately from class being compared
        - direct control over comparison
        - provides custom comparison logic for class
        - compare() method can compare object of this class with - either with same class - or with another class object
 */
class Employer {

    private String name;
    private Integer age;

}

class AgeComparator implements Comparator<Employer> {

    @Override
    public int compare(Employer o1, Employer o2) {
        return o1.getAge().compareTo(o2.getAge());
    }
}

class NameComparator implements Comparator<Employer> {

    @Override
    public int compare(Employer o1, Employer o2) {
        return o1.getName().compareTo(o2.getName());
    }
}


public class ComparatorImplementation {
    public static void main(String[] args) {
        List<Employer> list = new ArrayList<>();

        list.add(new Employer("Shubham", 25));
        list.add(new Employer("Ramesh", 52));
        list.add(new Employer("Jayashri", 48));
        list.add(new Employer("Tushar", 28));

        System.out.println(list);       //maintains insertion order

        //custom ordering using comparator : age
        Collections.sort(list, new AgeComparator());
        System.out.println(list);

        //custom ordering using comparator : name
        Collections.sort(list, new NameComparator());
        System.out.println(list);

        //reversing : ageComparator
        Collections.sort(list, new AgeComparator().reversed());
        System.out.println(list);

        //reversing : nameComparator
        Collections.sort(list, new NameComparator().reversed());
        System.out.println(list);
    }
}
