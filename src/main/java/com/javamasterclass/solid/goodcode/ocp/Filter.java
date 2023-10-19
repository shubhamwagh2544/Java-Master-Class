package com.javamasterclass.solid.goodcode.ocp;

import java.util.List;
import java.util.stream.Stream;

public interface Filter<T> {
    Stream<T> filterItems(List<T> list, Specification<T> specification);
}
