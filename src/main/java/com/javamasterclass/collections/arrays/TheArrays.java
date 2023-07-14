package com.javamasterclass.collections.arrays;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];

        colors[0] = "blue";
        colors[1] = "red";
        colors[2] = "green";
        colors[3] = "yellow";
        colors[4] = "violet";

        System.out.println(Arrays.toString(colors));

        // for with i
        for (int i = colors.length-1; i >= 0; i--) {
            System.out.print(colors[i]+ " ");
        }

        // enhanced for each
        for (String color : colors) {
            System.out.println(color);
        }

        //stream
        Arrays.stream(colors).forEach(System.out::println);
    }
}
