package com.javamasterclass.solid.goodcode.ocp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ColorSpecification implements Specification<Product> {

    private COLOR color;

    @Override
    public boolean isSatisfied(Product item) {
        return item.getColor().equals(color);
    }
}
