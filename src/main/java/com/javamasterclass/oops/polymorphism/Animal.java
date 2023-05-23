package com.javamasterclass.oops.polymorphism;

public class Animal {
    private final String sound;

    public Animal() {
        this.sound = "boo-hoo";
    }

    public void makeSound() {
        System.out.println("Animal making sound : " + sound);
    }
}
