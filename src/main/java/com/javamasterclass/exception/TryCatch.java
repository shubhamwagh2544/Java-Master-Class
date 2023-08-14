package com.javamasterclass.exception;


public class TryCatch {
    /*
            rules
            - thrown exception should be same or subtype of caught exception
            - if we throw checked exception A and catch any exception B -> then CE for checked exception A -> [unhandled exception A]
            - we can't catch checked exception even if not thrown one [thrown checked exceptions must be handled]
            - we can catch unchecked exception even if not thrown one [thrown unchecked may/may not be handled]

            - if unchecked ex explicitly handled -> no program break
            - if unchecked ex not handled -> program break

            - checked ex must be handled before code compilation - else CE

            while catching multiple exceptions together
            - Exception Types in multi-catch statement must be disjoint set
            - it means, one exception should not be subtype to another exception -> disjoint exceptions
            - we can't add checked and unchecked exceptions together in multi-catch -> exceptions shall be compatible

            - we can add subtypes of runtime exception in multi-catch
     */
    public static void main(String[] args) {
        try {
            System.out.println("inside try");
            throw new NumberFormatException();
        }
        catch (ArithmeticException e) {
            System.out.println("inside catch");
        }
        finally {
            System.out.println("inside finally");
        }
    }

}
