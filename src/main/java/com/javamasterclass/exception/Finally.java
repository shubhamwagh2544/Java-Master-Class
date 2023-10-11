package com.javamasterclass.exception;

public class Finally {
    /*
            finally
            - will get executed no matter what happens before finally block
            - even if we add return statement outside finally block / before finally block -> finally will get executed

            - if we add return statement in finally block at start/before code - unreachable code -> CE
     */
    public static int call() {
        try {
            System.out.println("inside try");
            //throw new Exception();                        // can't have throw and return in same block -> one unreachable
            return 0;
        }
        catch (Exception e) {
            //return 0;                                     // [unreachable statement - CE]
            System.out.println("inside catch");
        }
        finally {
            System.out.println("inside finally");
            //return 0;
            //System.out.println("inside finally");         // [unreachable statement - CE]
        }
        return 0;
    }

    public static void main(String[] args) {
        call();
    }
}
