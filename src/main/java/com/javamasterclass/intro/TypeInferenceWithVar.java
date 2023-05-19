package com.javamasterclass.intro;

import java.math.BigDecimal;
import java.util.Arrays;

public class TypeInferenceWithVar {
    public static void main(String[] args) {
        // Type Inference with var keyword
        /*
                var keyword is only to be used in local scope / as local variable
                not global scope, not class variable, not method parameter
                can be passed as argument for calling method :> since its local scope
         */

        var a = 10;
        var name = "Shubham Wagh";
        var isSmart = true;
        var charA = 'a';
        var names = new String[] {"shubham", "ramesh", "wagh"};
        var balance = 11_22_33_44_55.66_77;

        // JVM will automatically decide the type of data stored into variable

        System.out.println(a);
        System.out.println(name);
        System.out.println(isSmart);
        System.out.println(charA);
        System.out.println(Arrays.toString(names));
        System.out.println(balance);

        // passing as argument
        sayName(name);
    }
    private static void sayName(String name) {      // can't use var in parameter
        System.out.println(name);
    }
}
