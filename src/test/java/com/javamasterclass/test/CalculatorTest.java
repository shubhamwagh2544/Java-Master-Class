package com.javamasterclass.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {

    @Test
    void canAddTwoNumbers() {
        Calculator calculator = new Calculator();
        int number1 = 10;
        int number2 = 20;
        int addition = calculator.add(number1, number2);
        assertEquals(30, addition);
    }

}
