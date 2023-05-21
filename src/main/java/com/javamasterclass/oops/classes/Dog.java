package com.javamasterclass.oops.classes;

public class Dog {
    private String name;

    public Dog(String name) {       //public constructor
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void bow_wow() {
        System.out.println(this.name + " says bow-wow");
    }

    public static void main(String[] args) {
        //Cat cat = new Cat("jasper");  // we cant create Cat object in another class since its constructor has private access.
        Dog john = new Dog("john");
        Dog wick = new Dog("wick");

        john.bow_wow();
        wick.bow_wow();

        //Cat has default constructor public
        Cat tryme = new Cat();
        tryme.setName("happy-cat");
        tryme.meow();

    }
}
