package com.javamasterclass.solid.goodcode;

import java.util.List;

public class AreaCalculator implements IAreaCalculator {
    @Override
    public double sum(List<TwoDimensionalShape> shapes) {
        double sum = 0;
        for (int i = 0; i < shapes.size(); i++) {
            sum += shapes.get(i).area();
            //to add new functionality, we have to rewrite existing class
            //instead create a interface :> TwoDimensionalShape
        }
        return sum;
    }

}
