package com.javamasterclass.solid.goodcode.ocp;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {
    private String name;
    private COLOR color;
    private SIZE size;
}
