package com.javamasterclass.intro;

public class StringInJava {
    /*
            String Constant Pool
            -> special memory region in heap where strings are stored by JVM

            whenever we create string literal :
            - reference variable stored in stack
            - String literals are stored in SCP
            String objects created by new are stored into heap

            Since Strings are immutable in java, each modify operation will create new string
            Why immutable ?
            - security :> strings hold imp info like password, api keys etc. hence no modify
            - thread-safe :> multiple threads can safely access string knowing it is not modified
            - performance :> since strings cannot be modified, JVM reuses existing string objects
     */
    public static void main(String[] args) {
        String name1 = "shubham";
        String name2 = "shubham";
        //instead of creating new literal, name2 & name3 will refer to the same value hold by name1 in SCP
        String name3 = "shubham";
        name3 = name3.concat(" wagh");// :> will create new literal and new reference : name3 refers new literal
        // now name2 still refers to "shubham" held by name1.

        String name4 = new String("shubham"); // new object will be created in heap
        // and reference variable name4 is stored in stack

        //isBlank vs isEmpty
        /*
                isBlank :> checks
                    - if is empty
                    - if contains only whitespace character

                isEmpty :> true if and only if length is zero
                    - if is empty :> returns length() == 0
         */
        String one = "";
        String two = "     ";
        System.out.println(one.isEmpty());          // true
        System.out.println(two.isEmpty());          // false : contains whitespace characters

        System.out.println(one.isBlank());          // true
        System.out.println(two.isBlank());          // true

        String three = null;
        //System.out.println(three.isEmpty());        // NullPointerException
        //System.out.println(three.isBlank());        // NullPointerException

        //String Equality
        /*
                1. ==
                    - it is operator : to check both primitive datatype & objects
                    - will check value/data for primitive type
                    - will check location/address for objects
                    - since it is operator, cannot be overridden

                2. equals()
                    - to check objects only
                    - will check location/address for objects
                    - since it is Object method, string class overrides the equals()
                        - it first checks location of 2 strings
                        - then content/data/value of 2 strings
         */
        String nm1 = "shubham";
        String nm2 = new String("shubham");
        System.out.println(nm1 == nm2);             // false : since locations are diff
        System.out.println(nm1.equals(nm2));        // true since content is same

        //some string static methods
        String formattedString = String.format("String is %s %s %s %s", 10.00, "shubham", 1, true);
        System.out.println(formattedString);

        String jointString = String.join(":", new String[]{"Shubham", "Ramesh", "Wagh"});
        System.out.println(jointString);
    }
}
