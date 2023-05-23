package com.javamasterclass.solid.goodcode;

public interface TwoDimensionalShape {
    /*
            Open Closed Principle :
            Classes should be open for extension
            Closed for modification

            In other words,
            You should not have to rewrite an existing class
            for implementing new feature.
     */
    double area();
}
