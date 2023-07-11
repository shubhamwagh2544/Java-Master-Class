package com.javamasterclass.problems;


public class CheckPrime {
    private static boolean ifPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean ifPrimeBetter(int number) {
        double sqrt = Math.sqrt(number);
        for (int i = 2; i <= sqrt; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(ifPrime(121));
        System.out.println(ifPrimeBetter(121));
    }
}
