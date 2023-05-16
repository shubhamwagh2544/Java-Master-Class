package com.javamasterclass.code;


import lombok.*;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

@AllArgsConstructor
@NoArgsConstructor
@Data
class Employee {
    int id;
    String name;
    int age;
    String gender;
    String department;
    int yearOfJoining;
    double salary;
}

public class StreamTest {
    List<Employee> list;

    public StreamTest() {
        list = List.of(
                new Employee(111, "Shubham", 25, "male", "IT", 2022, 40000),
                new Employee(222, "Ramesh", 35, "male", "Civil", 2021, 50000),
                new Employee(333, "Tushar", 45, "male", "Mech", 2023, 6000),
                new Employee(444, "Tanvi", 55, "female", "Comp", 2019, 70000),
                new Employee(555, "Jayashri", 65, "female", "Prod", 2020, 80000),
                new Employee(666, "Dashrath", 75, "male", "IT", 2022, 90000),
                new Employee(777, "Abhishek", 85, "male", "Mech", 2021, 10000),
                new Employee(888, "Arpit", 95, "male", "Comp", 2022, 20000),
                new Employee(999, "Akshay", 15, "male", "Civil", 2023, 30000));
    }

    @Test
    public void one() {
        //1 : how many males and females
        long maleCount = list
                .stream()
                .filter(employee -> employee.gender.equalsIgnoreCase("male"))
                .count();
        System.out.println(maleCount);

        long femaleCount = list
                .stream()
                .filter(employee -> employee.gender.equalsIgnoreCase("female"))
                .count();
        System.out.println(femaleCount);
    }

    @Test
    public void two() {
        //1 : how many males and females
        Map<String, Long> collected = list
                .stream()
                .collect(Collectors.groupingBy(
                        Employee::getGender,
                        Collectors.counting()
                ));
        System.out.println(collected);
    }

    @Test
    public void three() {
        //2 : names of all departments
        list
                .stream()
                .map(Employee::getDepartment)
                .distinct()
                .forEach(System.out::println);
    }

    @Test
    public void four() {
        //average age of male and female employees
        Map<String, Double> averageAge = list
                .stream()
                .collect(Collectors.groupingBy(
                        Employee::getGender,
                        Collectors.averagingInt(Employee::getAge)
                ));
        System.out.println(averageAge);
    }

    @Test
    public void five() {
        //4 : details of highest paid employee
        Optional<Employee> ans = list
                .stream()
                .max(Comparator.comparing(Employee::getSalary));
        System.out.println(ans.get());
    }

    @Test
    public void six() {
        //4 : details of highest paid employee
        Optional<Employee> ans = list
                .stream()
                .collect(Collectors.maxBy(
                        Comparator.comparing(Employee::getSalary)
                ));
        System.out.println(ans.get());
    }

    @Test
    public void seven() {
        //5 : names of all employees who joined after 2021
        list
                .stream()
                .filter(employee -> employee.getYearOfJoining() > 2021)
                .forEach(System.out::println);
    }

    @Test
    public void eight() {
        //5 : names of all employees who joined after 2021
        list
                .stream()
                .filter(employee -> employee.getYearOfJoining() > 2021)
                .map(Employee::getName)
                .forEach(System.out::println);
    }

    @Test
    public void nine() {
        //6 : number of employees in each department
        Map<String, Long> ans = list
                .stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.counting()
                ));
        System.out.println(ans);
    }

    @Test
    public void ten() {
        //7 : average salary of each department
        Map<String, Double> ans = list
                .stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));
        System.out.println(ans);
    }

    @Test
    public void eleven() {
        //8 : details of the youngest male employee
        Optional<Employee> ans = list
                .stream()
                .min(Comparator.comparing(Employee::getAge));

        ans.ifPresent(employee -> System.out.println(employee.getName()));
    }

    @Test
    public void twelve() {
        //9 : most working experience of all
        Optional<Employee> ans = list
                .stream()
                .min(Comparator.comparing(Employee::getYearOfJoining));

        ans.ifPresent(employee -> System.out.println(employee.getName()));
    }

    @Test
    public void thirteen() {
        //10 : average salary of male and female employees
        Map<String, Double> ans = list
                .stream()
                .collect(Collectors.groupingBy(
                        Employee::getGender,
                        Collectors.averagingDouble(Employee::getSalary)
                ));
        System.out.println(ans);
    }

    @Test
    public void fourteen() {
        //11 : names of all employees in each department
        Map<String, List<Employee>> ans = list
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        Set<Map.Entry<String, List<Employee>>> entries = ans.entrySet();

        for (Map.Entry<String, List<Employee>> entry : entries) {
            System.out.println("For Department : " + entry.getKey());
            List<Employee> value = entry.getValue();
            value.forEach(employee -> System.out.println(employee.getName()));
            System.out.println("--------------------------------------------");
        }
    }

    @Test
    public void fifteen() {
        //12 : average salary and total salary of whole organisation
        DoubleSummaryStatistics ans = list
                .stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));

        System.out.println("Average : " + ans.getAverage());
        System.out.println("Total : " + ans.getSum());
    }

    @Test
    public void sixteen() {
        //13 : separate employees who are younger than 50 and greater than 50
        List<Employee> lessThan50 = list
                .stream()
                .filter(employee -> employee.getAge() < 50)
                .collect(Collectors.toList());

        List<Employee> moreThan50 = list
                .stream()
                .filter(employee -> employee.getAge() > 50)
                .collect(Collectors.toList());

        System.out.println("Less Than 50");
        lessThan50.forEach(employee -> System.out.println(employee.getName()));
        System.out.println("More Than 50");
        moreThan50.forEach(employee -> System.out.println(employee.getName()));
    }

    @Test
    public void seventeen() {
        //13 : separate employees who are younger than 50 and greater than 50
        Map<Boolean, List<Employee>> ans = list
                .stream()
                .collect(Collectors.partitioningBy(
                        employee -> employee.getAge() < 50
                ));

        System.out.println("Less Than 50");
        List<Employee> lessThan50 = ans.get(Boolean.TRUE);
        lessThan50.forEach(employee -> System.out.println(employee.getName()));

        System.out.println("More Than 50");
        List<Employee> moreThan50 = ans.get(Boolean.FALSE);
        moreThan50.forEach(employee -> System.out.println(employee.getName()));
    }

    @Test
    public void eighteen() {
        //14 : who is the oldest employee ? his age and department ?
        Optional<Employee> ans = list
                .stream()
                .max(Comparator.comparing(Employee::getAge));

        ans.ifPresent(employee -> System.out.println("Name : " + employee.getName() + "\nDepartment : " + employee.getDepartment()));
    }

    public static void main(String[] args) {
        StreamTest streamTest = new StreamTest();

        //1 : how many males and females
        streamTest.one();
        streamTest.two();
        //2 : names of all departments
        streamTest.three();
        //3 : average age of male and female employees
        streamTest.four();
        //4 : details of highest paid employee
        streamTest.five();
        streamTest.six();
        //5 : names of all employees who joined after 2021
        streamTest.seven();
        streamTest.eight();
        //6 : number of employees in each department
        streamTest.nine();
        //7 : average salary of each department
        streamTest.ten();
        //8 : details of the youngest male employee
        streamTest.eleven();
        //9 : most working experience of all
        streamTest.twelve();
        //10 : average salary of male and female employees
        streamTest.thirteen();
        //11 : names of all employees in each department
        streamTest.fourteen();
        //12 : average salary and total salary of whole organisation
        streamTest.fifteen();
        //13 : separate employees who are younger than 50 and greater than 50
        streamTest.sixteen();
        streamTest.seventeen();
        //14 : who is the oldest employee ? his age and department ?
        streamTest.eighteen();
    }

}
