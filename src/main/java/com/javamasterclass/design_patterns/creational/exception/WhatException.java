package com.javamasterclass.design_patterns.creational.exception;

import java.io.File;

public class WhatException {
    /*
            Exception :> something that breaks program's normal flow of execution
            Two Types

            - RunTime Exception / Unchecked Exceptions
                - exceptions that break program flow in runtime
                - we compile code, and it breaks in runtime
                - NumberFormatException ( we parse string to parseInt method
                  but string cannot be converted into number throwing NumberFormatException which extends RunTime Ex

            - CompileTime Exception / Checked Exceptions
                - exceptions that are not subclass of RunTime Ex are Checked Ex
                - IOException ( we can't compile code before catching IOException : Hence checked )
     */
    public static void main(String[] args) {
        //RunTime Ex : Unchecked
        //No need to add try-catch
        //Code compiles and exception thrown at runtime
        Integer integer = Integer.parseInt("1s");
        System.out.println(integer);


        //Checked Ex : CompileTime Ex
        //Catch exception before code compile
        //try {
            File file = new File("src/foo.txt");
            if (!file.exists()) {
                //file.createNewFile();               //IOException : we have to add try-catch before compiling code
            }
        //}
        //catch (IOException e) {
        //    System.out.println(e.getMessage());
        //}

    }
}
