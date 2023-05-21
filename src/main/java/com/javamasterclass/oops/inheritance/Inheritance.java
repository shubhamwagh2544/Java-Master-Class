package com.javamasterclass.oops.inheritance;

public class Inheritance {
    /*
            What is inheritance ?
            1. ability to create a new class from existing class
     */
    public static void main(String[] args) {
        Programmer javaProgrammer = new Programmer(
                "shubham wagh",
                25,
                "pune maharashtra india",
                "1 Year"
        );

        String[] programmingLang = {"python", "java", "c++", "csharp"};

        Programmer pythonProgrammer = new Programmer(
                "jamie lannister",
                45,
                "golden city",
                "6 Years",
                programmingLang
        );

        System.out.println(javaProgrammer);         //toString method called from Parent Employee Class
        System.out.println(pythonProgrammer);       //toString method called from Parent Employee Class

        javaProgrammer.writeSomeCode();
        System.out.println(pythonProgrammer.getExperience());   //getExperience() called from Parent Employee Class

        System.out.println(javaProgrammer.isIndian);        //protected field available to subclasses (anywhere through inheritance)

        //overridden method
        pythonProgrammer.sayHi();
    }
}

/*
        Java do not support multiple inheritance :> bcz it can lead to diamond problem

        What is Diamond Problem
            :> while making a call to same superclass method in two or three classes
               it leads to ambiguity as
               compiler doesn't know which superclass method to execute

        Hence Java do not support multiple inheritance
 */
