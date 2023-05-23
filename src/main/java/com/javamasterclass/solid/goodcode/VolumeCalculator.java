package com.javamasterclass.solid.goodcode;

import java.util.List;

public class VolumeCalculator implements IVolumeCalculator {

    @Override
    public double sum(List<ThreeDimensionalShape> shapes) {
        double sum = 0;
        for (int i = 0; i < shapes.size(); i++) {
            sum += shapes.get(i).volume();
        }
        return sum;
    }

}
