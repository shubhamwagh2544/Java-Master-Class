package com.javamasterclass.oops.polymorphism;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();

        Dog dog = new Dog();
        dog.makeSound();

        Animal[] animals = {cat, dog};          // polymorphism :> one name, multiple forms
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
