package com.javamasterclass.intro;

public class TypeCasting {
    /*
            Type Casting : converting one data type into another

            - Implicit Type : Widening Casting
            - Explicit Type : Narrowing Casting

     */
    public static void main(String[] args) {
        int number = 100;
        double numberAsDouble = number;         // widening : int -> double

        System.out.println(number);
        System.out.println(numberAsDouble);

        double balance = 100.55;
        int balanceAsInt = (int) balance;       // narrowing : double -> int

        System.out.println(balance);            //100.55
        System.out.println(balanceAsInt);       //100 (Loss of Data/Bits)
    }
}
