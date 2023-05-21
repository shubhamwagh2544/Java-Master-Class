package com.javamasterclass.oops.inheritance;

public class Manager extends Employee {

    private int teamSize;

    public Manager(String name, int age, String address, String experience) {
        super(name, age, address, experience);
    }

    public Manager(String name, int age, String address, String experience, int teamSize) {
        super(name, age, address, experience);
        this.teamSize = teamSize;
    }

    public void report() {
        System.out.println("manager preparing some reports");
    }

}
