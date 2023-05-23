package com.javamasterclass.solid.goodcode;

import java.util.List;

public class ThreeDShapePrinter {
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
    IVolumeCalculator volumeCalculator = new VolumeCalculator();
    public String json(List<ThreeDimensionalShape> shapes) {
        return "{sum:%s}".formatted(volumeCalculator.sum(shapes));
    }

    public String csv(List<ThreeDimensionalShape> shapes) {
        return "sum,%s".formatted(volumeCalculator.sum(shapes));
    }
}
