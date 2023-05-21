package com.javamasterclass.oops.classes;

public class Pojo {
    /*
            What is pojo in java :> plain old java object
            - conditions to be pojo
            1. simple entity class with no restrictions
            2. fields with no restriction on access modifiers ( can be private/public/protected )
            3. should not implement any interface or extend class.
     */

    // can have private, public, protected fields
    private int age;
    public String name;
    protected String address;
    double salary;

    // can have parameterized constructor
    public Pojo(int age, String name, String address, double salary) {
        this.age = age;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    //can have 0-args constructor
    public Pojo() {}

    //can have getter setter
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
