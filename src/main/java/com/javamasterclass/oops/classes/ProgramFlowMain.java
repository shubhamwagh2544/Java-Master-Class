package com.javamasterclass.oops.classes;

public class ProgramFlowMain {
    static {
        System.out.println("static inside program-flow-main class");
    }
    public static void main(String[] args) {
        //program flow
        /*
                1. static block inside main : first main class is loaded and called
                2. when we write anything ProgramFlow class related or create object,
                   static block inside that class is called
                3. then default constructor for 0-args constructor calling
                4. then parametrized constructor for parametrized constructor calling
         */

        ProgramFlow.hello = "this will call static block in ProgramFlow class";

        // instance block will be called after all static block execution
        //                               before default constructor call
        ProgramFlow staticFlow = new ProgramFlow();       // first call to static block then 0-args constructor

        staticFlow = new ProgramFlow("program");    // first call to static block then parametrized constructor

        // each time object is created with new keyword, instance block will be called
        // static block is called only once at time of class loading

    }
}
