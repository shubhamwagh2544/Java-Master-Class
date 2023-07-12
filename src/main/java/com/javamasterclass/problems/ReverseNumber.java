package com.javamasterclass.problems;

public class ReverseNumber {
    public static void main(String[] args) {
        reverseNumber();
        reverseNumberWithTrailingZeroes();
    }

    private static void reverseNumber() {
        int number = 12;
        int reverse = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        System.out.println(reverse);
    }

    private static void reverseNumberWithTrailingZeroes() {
        int number = 1200;
        int reverse = 0;

        //zeroes at end
        String num = String.valueOf(number);
        int cnt = 0;
        for (int i = num.length()-1; i >= 0; i--) {
            if (num.charAt(i) != '0') {
                num = num.substring(0, i+1);
                break;
            }
            cnt++;
        }

        number = Integer.parseInt(num);

        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }

        String temp = "";
        while (cnt != 0) {
            temp += "0";
            cnt--;
        }

        String reversed = temp.concat(String.valueOf(reverse));
        System.out.println(reversed);                               //2100 - since it is string

        reverse = Integer.parseInt(reversed);
        System.out.println(reverse);                                //21 - since it is number
    }
}
