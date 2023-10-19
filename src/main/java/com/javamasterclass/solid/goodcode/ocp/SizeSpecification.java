package com.javamasterclass.solid.goodcode.ocp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SizeSpecification implements Specification<Product> {

    private SIZE size;

    @Override
    public boolean isSatisfied(Product item) {
        return item.getSize().equals(size);
    }
}
