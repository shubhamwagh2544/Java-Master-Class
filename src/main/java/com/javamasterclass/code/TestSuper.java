package com.javamasterclass.code;

class Animal {
    private String name;
    Animal() {
        name = "new animal";
    }

    @Override
    public String toString() {
        return super.toString();
        //getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
}

class Dog {
    private String name;
    Dog() {
        name = "new dog";
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class TestSuper {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal);

        Dog dog = new Dog();
        System.out.println(dog);
    }
}
