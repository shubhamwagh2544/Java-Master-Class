package com.javamasterclass.oops.polymorphism;

public class Dog extends Animal {
    private final String sound;

    public Dog() {
        this.sound = "bow";
    }

    public void makeSound() {
        System.out.println("Dog making sound : " + sound);
    }
}
