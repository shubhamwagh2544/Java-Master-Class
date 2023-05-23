package com.javamasterclass.solid.goodcode;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        IAreaCalculator areaCalculator = new AreaCalculator();       // SRP
        TwoDShapePrinter shapePrinter = new TwoDShapePrinter();

        TwoDimensionalShape circle = new Circle(10);                      // OCP
        TwoDimensionalShape square = new Square(10);                      // OCP
        TwoDimensionalShape cube = new Cube(10);                            // OCP
        List<TwoDimensionalShape> shapes = List.of(circle, square, cube);

        //sum of area
        System.out.println(shapePrinter.json(shapes));
        System.out.println(shapePrinter.csv(shapes));

        TwoDimensionalShape noshape = new NoShape();             //NoShape breaks : LSP
        //noshape.area();

        //volume of cube
        ThreeDimensionalShape cube1 = new Cube(10);             // ISP
        ThreeDimensionalShape cube2 = new Cube(20);
        List<ThreeDimensionalShape> shapes1 = List.of(cube1, cube2);
        IVolumeCalculator volumeCalculator = new VolumeCalculator();

        ThreeDShapePrinter threeDShapePrinter = new ThreeDShapePrinter();
        //sum of volumes
        System.out.println(threeDShapePrinter.json(shapes1));
        System.out.println(threeDShapePrinter.csv(shapes1));

    }
}
