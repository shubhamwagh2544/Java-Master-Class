package com.javamasterclass.solid.badcode.ocp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
@Getter
@Setter
class Product {
    private String name;
    private COLOR color;
    private SIZE size;
}

class ProductUtil {
    private List<Product> products = new ArrayList<>();
    public void addProduct(Product product) {
        this.products.add(product);
    }
    public void removeProduct(Product product) {
        this.products.remove(product);
    }
}
class ProductFilter {

    public Stream<Product> filterByColor() {
        
    }
}
public class Demo {
    public static void main(String[] args) {

    }
}
