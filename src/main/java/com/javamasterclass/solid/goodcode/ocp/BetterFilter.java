package com.javamasterclass.solid.goodcode.ocp;

import java.util.List;
import java.util.stream.Stream;

public class BetterFilter implements Filter<Product> {

    @Override
    public Stream<Product> filterItems(List<Product> list, Specification<Product> specification) {
        return list.stream().filter(product -> specification.isSatisfied(product));
    }

}
