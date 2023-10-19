package com.javamasterclass.solid.badcode.ocp;

import lombok.*;
import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

enum COLOR {
    RED, GREEN, YELLOW
}
enum SIZE {
    SMALL, LARGE, HUGE
}

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
class Product {
    private String name;
    private COLOR color;
    private SIZE size;
}
class ProductFilter {

    public Stream<Product> filterByColor(List<Product> products, COLOR color) {
        return products.stream().filter(product -> product.getColor().equals(color));
    }
    public Stream<Product> filterBySize(List<Product> products, SIZE size) {
        return products.stream().filter(product -> product.getSize().equals(size));
    }
    public Stream<Product> filterByColorAndSize(List<Product> products, COLOR color, SIZE size) {
        return products.stream().filter(product -> product.getColor().equals(color) && product.getSize().equals(size));
    }
}
public class Demo {
    public static void main(String[] args) {
        Product product1 = new Product("iPhone 14", COLOR.RED, SIZE.LARGE);
        Product product2 = new Product("iPad Air 3", COLOR.GREEN, SIZE.HUGE);
        Product product3 = new Product("Macbook M1 Pro", COLOR.YELLOW, SIZE.SMALL);

        List<Product> products = List.of(product1, product2, product3);

        //Product Filter
        ProductFilter productFilter = new ProductFilter();
        productFilter.filterByColor(products, COLOR.RED).forEach(System.out::println);
        productFilter.filterByColor(products, COLOR.YELLOW).forEach(System.out::println);

        productFilter.filterBySize(products, SIZE.HUGE).forEach(System.out::println);
        productFilter.filterBySize(products, SIZE.LARGE).forEach(System.out::println);

        productFilter.filterByColorAndSize(products, COLOR.YELLOW, SIZE.SMALL).forEach(System.out::println);
        productFilter.filterByColorAndSize(products, COLOR.RED, SIZE.HUGE).forEach(System.out::println);
    }
}
