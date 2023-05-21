package com.javamasterclass.oops.classes;

public class ProgramFlow {
    private String name;
    static String hello;

    static {
        System.out.println("static block inside ProgramFlow");
    }

    {
        System.out.println("instance block inside ProgramFlow");
        this.name = "hush";
    }

    public ProgramFlow() {
        System.out.println("Inside default constructor block");
    }

    public ProgramFlow(String name) {
        System.out.println("Inside parametrized constructor block");
        this.name = name;
    }
}
