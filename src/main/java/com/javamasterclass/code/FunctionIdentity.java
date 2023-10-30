package com.javamasterclass.code;

import java.util.function.Function;
import java.util.function.UnaryOperator;

/*
Function.identity()

It is a static method that simply returns its input.
In other words, it's an identity function that takes an argument and
returns the same argument without any transformation
*/
public class FunctionIdentity {
    public static void main(String[] args) {
        //Function Identity : takes input and return same as output
        Function<String, String> functionIdentity = name -> name;

        String input = "shubham wagh";

        String output = functionIdentity.apply(input);

        System.out.println("Input : " + input);
        System.out.println("Output : " + output);

        //other way to do that
        //UnaryOperator : takes one argument of type T and returns a result of type T
        UnaryOperator<String> unaryOperator = name -> name;
        String nameInput = "shubham wagh";

        String nameOutput = unaryOperator.apply(nameInput);

        System.out.println("Input : " + nameInput);
        System.out.println("Output : " + nameOutput);
    }

}
