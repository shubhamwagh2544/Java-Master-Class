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
class Student {
    private String name;
    private Integer age;
}

public class NewComparatorMethods {
    public static void main(String[] args) {
        //comparing method : name
        Comparator<Student> nameComparator = Comparator.comparing(Student::getName);

        //comparing method : age
        Comparator<Student> ageComparator = Comparator.comparing((student) -> {
            return student.getAge();
        });

        List<Student> students = new ArrayList<>();
        students.add(new Student("Shubham", 25));
        students.add(new Student("Ramesh", 52));
        students.add(new Student("Jayashri", 48));

        //comparator : name
        Collections.sort(students, nameComparator);
        System.out.println(students);

        //comparator : age
        Collections.sort(students, ageComparator);
        System.out.println(students);
    }
}
