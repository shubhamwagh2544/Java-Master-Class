package com.javamasterclass.intro;

public class PassByValueWithReferenceAnother {

    public static void changePerson(Person person) {
        person = null;
    }

    public static void main(String[] args) {
        Person person = new Person("Shubham Wagh");

        changePerson(person);

        System.out.println(person);
        System.out.println(person == null);     // false
        // reference value is passed
        // only by returning null value and assigning it to original person reference

    }
}
