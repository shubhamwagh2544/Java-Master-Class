package com.javamasterclass.intro;

import java.math.BigDecimal;

public class ProblemWithDoubles {
    public static void main(String[] args) {
        double number1 = 0.02;
        double number2 = 0.03;
        System.out.println(number2 - number1);      // ans should be 0.01 but coming as 0.009999999999999998

        // how to solve this problem
        /*
                Solution : BigDecimal
                In business apps, we use BigDecimal for doing money transactions
         */
        BigDecimal bigDecimal1 = new BigDecimal("0.02");
        BigDecimal bigDecimal2 = new BigDecimal("0.03");

        BigDecimal subtract = bigDecimal2.subtract(bigDecimal1);
        System.out.println(subtract);

        // working with bigdecimals
        BigDecimal number = BigDecimal.TEN;

        System.out.println(number.compareTo(BigDecimal.ONE));
        System.out.println(number.add(new BigDecimal("11.11")));
        System.out.println(number.max(BigDecimal.ZERO));
        System.out.println(number.multiply(new BigDecimal("12.25")));
    }
}
