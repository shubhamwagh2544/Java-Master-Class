package com.javamasterclass.dependency_injection;

public class Main {
    public static void main(String[] args) {

        CarDao carDao = new CarDao();                       // dependency
        CarService carService = new CarService(carDao);     // injection

        //what if there are multiple classes in a program
        //for each class, we need to initialise object with new keyword and inject into another class
        //Hence Spring Container :> Manages and Provides Bean to Program ( Bean is singleton by default )

    }
}
