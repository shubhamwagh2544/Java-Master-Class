package com.javamasterclass.solid.goodcode;

public class NoShape implements TwoDimensionalShape {
    /*
            Liskov Substitution Principle :
            Every subclass should be substitutable for their parent class.

            This NoShape class breaks LSP :> it cannot find/have area.
            Hence, subclass should be in such a way that it should logically substitute parent.
     */
    @Override
    public double area() {
        throw new IllegalStateException("Cannot find area of no shape");            // breaks LSP
    }
}
