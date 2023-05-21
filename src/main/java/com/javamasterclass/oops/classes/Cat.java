package com.javamasterclass.oops.classes;

public class Cat {
    private String name;
    private Cat(String name) {          // private parametrized constructor
        this.name = name;
    }
    public Cat() {}                     // public default constructor

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println(this.name+ " says meow");
    }

    public static void main(String[] args) {
        Cat jasper = new Cat("jasper");
        Cat rosie = new Cat("rosie");
        Cat hermione = new Cat("hermione");

        jasper.meow();
        rosie.meow();
        hermione.meow();

        Dog lily = new Dog("lily");
        Dog jamie = new Dog("jamie");

        lily.bow_wow();
        jamie.bow_wow();

        // to create object with zero arguments :> need default constructor
        Cat defaultCat = new Cat();
        defaultCat.setName("gigi");
        defaultCat.meow();

    }
}
