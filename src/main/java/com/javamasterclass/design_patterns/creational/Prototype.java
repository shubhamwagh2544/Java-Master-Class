package com.javamasterclass.design_patterns.creational;

public class Prototype implements Cloneable {       // to clone object => class to be cloned needs to implement Cloneable
    private final String name;

    public Prototype(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Prototype{" +
                "name='" + name + '\'' +
                '}';
    }
    public Object clone() throws CloneNotSupportedException {   //clone() throws CloneNotSupportedException
        return super.clone();
    }
    public static void main(String[] args) {
        Prototype prototype = new Prototype("Shubham Wagh");
        System.out.println("Original Object : " + prototype);

        try {
            Prototype prototype1 = (Prototype) prototype.clone();
            System.out.println("Cloned Object : " + prototype1);
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
