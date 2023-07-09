package com.javamasterclass.oops.abstraction;

public class Implementor3 {
    public static void main(String[] args) {

        Interface.sayMyName2();                 //no need to implement interface for calling static methods.

        //Interface.sayMyName1(); -> we can't call Interface static method sayMyName1() since it is private.

        //Interface.greet(); -> we can't call interface default method without implementing it.

    }
}
