package com.javamasterclass.oops.polymorphism;

public class Cat extends Animal{
    private final String sound;

    public Cat() {
        this.sound = "meow";
    }

    public void makeSound() {
        System.out.println("Cat making sound : " + sound);
    }

}
