package com.javamasterclass.intro.javaispassbyvalue;


import java.awt.*;
import java.util.Arrays;

public class PassByValueWithReference {
    public static void main(String[] args) {
        // pass by value with object

        Point pointA = new Point(10, 10);
        //Object stored in heap and reference returned to A in stack

        // (reference copied into B)
        Point pointB = pointA;      //B refers to same reference A is pointing to in heap
        //hence change in A or B results in each other change

        pointB.x = 100;
        pointB.y = 100;

        System.out.println(pointA);
        System.out.println(pointB);

        pointB = new Point(20, 20);
        //now B is reference to another object in heap
        //change in B won't change A now
        pointB.x = 200;
        pointB.y = 200;
        System.out.println(pointA);
        System.out.println(pointB);

    }
}
