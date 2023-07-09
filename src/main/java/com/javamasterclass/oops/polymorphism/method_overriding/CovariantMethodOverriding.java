package com.javamasterclass.oops.polymorphism.method_overriding;


class Animal {
    public Animal getAnimal() {
        return new Animal();
    }
}

class Dog extends Animal {
    @Override
    public Dog getAnimal() {
        //return new Dog();
        return this;
    }
}

/*
        Covariant Method Overriding:
        - return type of overridden method in subclass can be different from return type of parent class method
        - allows the return type of overridden method in subclass to be subtype of return type of parent class method
 */
public class CovariantMethodOverriding {
    public static void main(String[] args) {
        //case 1
        Animal animal = new Dog();
        Dog dog = (Dog) animal.getAnimal();

        System.out.println(dog.equals(animal));

        //case 2
        Dog dog1 = new Dog();
        Dog dog2 = dog1.getAnimal();

        System.out.println(dog1.equals(dog2));
    }
}
