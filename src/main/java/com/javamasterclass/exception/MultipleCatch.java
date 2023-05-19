package com.javamasterclass.exception;

public class MultipleCatch {
    public static void main(String[] args) {
        try {
            Integer integer = Integer.parseInt("1x");
            System.out.println(integer);
        }
        catch (NumberFormatException e) {
            System.out.println("cannot parse int");
        }

        try {
            Integer integer = Integer.parseInt("1");
            System.out.println(integer);

            for (int i = 10; i >= 0; i--) {
                System.out.println(10 / i);
            }
        }
//        catch (NumberFormatException | ArithmeticException e) {         // combining exceptions together
//            System.out.println(e.getMessage());
//        }
        catch (NumberFormatException e) {
            System.out.println("cannot parse int");
        }
        catch (ArithmeticException e) {
            System.out.println("cannot divide by zero");
        }
        catch (Exception e) {
            System.out.println("something wrong in code. Hence catching all exception");
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("finally always run :)");
        }

    }
}
