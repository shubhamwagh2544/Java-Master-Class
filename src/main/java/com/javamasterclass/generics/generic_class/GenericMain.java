package com.javamasterclass.generics.generic_class;

public class GenericMain {
    public static void main(String[] args) {
        Box<Phone> box = new Box<>();
        box.set(new Phone("iPhone"));
        System.out.println(box.get());

        Box<Phone> box1 = new Box<>();
        box1.set(new Phone("Nothing"));
        System.out.println(box1.get());
    }
}
