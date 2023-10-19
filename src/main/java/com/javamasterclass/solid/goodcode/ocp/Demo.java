package com.javamasterclass.solid.goodcode.ocp;

import java.util.List;

enum COLOR {
    RED, GREEN, YELLOW
}

enum SIZE {
    SMALL, LARGE, HUGE
}

public class Demo {
    public static void main(String[] args) {
        Product product1 = new Product("iPhone 14", COLOR.YELLOW, SIZE.SMALL);
        Product product2 = new Product("iPad Air 3", COLOR.RED, SIZE.LARGE);
        Product product3 = new Product("MacBook M1 Pro", COLOR.GREEN, SIZE.HUGE);

        List<Product> products = List.of(product1, product2, product3);

        //Better Product Filter
        BetterFilter betterFilter = new BetterFilter();
        betterFilter.filterItems(products, new ColorSpecification(COLOR.RED)).forEach(System.out::println);
        betterFilter.filterItems(products, new SizeSpecification(SIZE.HUGE)).forEach(System.out::println);

        betterFilter.filterItems(products, new AndSpecification<>(
                        new ColorSpecification(COLOR.YELLOW),
                        new SizeSpecification(SIZE.SMALL))
                )
                .forEach(System.out::println);
    }
}
