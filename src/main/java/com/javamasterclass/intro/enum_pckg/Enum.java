package com.javamasterclass.intro.enum_pckg;

import java.util.Arrays;

public class Enum {

    //Other way to create constants in java : enum

    public static void main(String[] args) {
        System.out.println(Gender.MALE);
        System.out.println(Gender.FEMALE);

        // MALE FEMALE are of Type Gender
        Gender male = Gender.MALE;
        Gender female = Gender.FEMALE;

        System.out.println(male);
        System.out.println(female);

        //Gender.values() :> return values of Type Gender into Gender Array
        Gender[] values = Gender.values();
        System.out.println(Arrays.toString(values));

        //looping
        for (Gender gender : Gender.values()) {
            System.out.println(gender);
        }

        //passing Gender value as string
        String other = "OTHER";
        printGender(Gender.valueOf(other));

    }

    private static void printGender(Gender gender) {
        System.out.println(gender);
    }
}
