package com.javamasterclass.solid.goodcode;

public class Cube implements TwoDimensionalShape, ThreeDimensionalShape {
    private int side;

    public Cube(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double area() {
        return 6 * Math.pow(getSide(), 2);
    }

    @Override
    public double volume() {
        return Math.pow(getSide(), 3);
    }
}
