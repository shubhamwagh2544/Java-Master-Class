package com.javamasterclass.aceessmodifiers.private_mod;

import java.util.Arrays;

public class TestPrivate {
    public static void main(String[] args) {
        System.out.println(
                "only public things are accessible everywhere\n" +
                "Since all props and methods are declared private in MainPrivate\n" +
                "nothing is accessible from MainPrivate"
        );
    }
}
