package com.javamasterclass.solid.goodcode;

import java.util.List;

public class TwoDShapePrinter {
    /*
            Single Responsibility Principle :
            Each class should have only one sole purpose
            and not be filled with excessive functionality
     */

    /*
            Dependency Inversion Principle :
            Components should depend upon abstractions
            not on concretions.
     */
    IAreaCalculator areaCalculator = new AreaCalculator();
    public String json(List<TwoDimensionalShape> shapes) {
        return "{sum:%s}".formatted(areaCalculator.sum(shapes));
    }

    public String csv(List<TwoDimensionalShape> shapes) {
        return "sum,%s".formatted(areaCalculator.sum(shapes));
    }
}
