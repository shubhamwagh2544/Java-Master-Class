package com.javamasterclass.nonaccessmodifiers;

public class Static {
    //static is class property : same copy shared across all objects : memory efficiency
    static String name = "shubham wagh";
    String firstName = "shubham";

    public static void main(String[] args) {
        System.out.println(name);               // static called from static only
        System.out.println(
                "we cannot call firstName from static method as it is non-static" +
                "To call non-static variable, we will have to create object"
        );

        Static obj = new Static();
        System.out.println(obj.firstName);      // non-static can be accessed in static through object
    }

    private void sayName() {
        System.out.println(firstName);      // non-static can be accessed in non-static directly
        System.out.println(name);           // static can be also accessed in non-static directly
    }

    private static void sayAnotherName() {
        Static objAnother = new Static();
        System.out.println(objAnother.firstName);       // non-static called in static through object

        System.out.println(name);                       // static called in static directly
        System.out.println(Static.name);                // static called in static through class name also
    }

}
// non-static can't be directly called from static : through object
// static can be called directly from non-static : direct or through class name