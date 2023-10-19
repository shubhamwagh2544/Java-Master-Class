package com.javamasterclass.solid.goodcode.ocp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AndSpecification<T> implements Specification<T> {

    private Specification<T> first;
    private Specification<T> second;

    public boolean isSatisfied(T item) {
        return first.isSatisfied(item) && second.isSatisfied(item);
    }

}
