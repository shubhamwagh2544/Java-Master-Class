package com.javamasterclass.design_patterns.creational.exception;

public class ChainedExceptions {
    public static void main(String[] args) throws Exception {
        //throw and throws
        //surround by try-catch
        try {
            divide(10, 0);                      // either we can catch ex or ask main method to throw ex
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

        //handling chained ex
        //adding throws at main()
        wagh();                 // either try-catch or throws signature at main method
        ahmednagar();
    }
    static void divide(int a, int b) throws Exception {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        else {
            System.out.println("Division : " + a / b);
        }
    }
    static void ahmednagar() /*throws Exception*/ {
        wagh();
    }
    static void wagh() /*throws Exception*/ {            // we can handle either by adding throws signature to method OR by try-catch
        try {
            ramesh();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    static void ramesh() throws Exception {
        shubham();
    }
    static void shubham() throws Exception{
        divide(10, 0);
    }
}
