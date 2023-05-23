package com.javamasterclass.solid.goodcode;

public interface ThreeDimensionalShape {
    /*
            Interface Segregation Principle :
            Interface should not force classes to implement what they cannot do / supposed not to do

            Large interfaces should be divided into smaller ones
     */
    double volume();
}
