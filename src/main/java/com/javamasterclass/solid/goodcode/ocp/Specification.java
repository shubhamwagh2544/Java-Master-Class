package com.javamasterclass.solid.goodcode.ocp;

public interface Specification<T> {
    boolean isSatisfied(T item);
}
