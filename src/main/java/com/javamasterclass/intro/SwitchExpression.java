package com.javamasterclass.intro;

public class SwitchExpression {
    public static void main(String[] args) {
        char grade = 'A';

        String result = switch (grade) {
            case 'A'-> "PASSED";
            case 'B', 'C', 'D' -> "SOMEWHAT PASSED";
            default -> "FAILED";
        };

        System.out.println(result);
    }
}
