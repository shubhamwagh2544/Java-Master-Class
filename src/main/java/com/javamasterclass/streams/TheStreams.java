package com.javamasterclass.streams;

import java.util.List;
import java.util.Optional;

public class TheStreams {
    public static void main(String[] args) {
        List<String> list = List.of(
                "Shubham",
                "Ramesh",
                "Wagh"
        );

        Optional<String> optional = list
                .stream()
                .filter(s -> s.startsWith("S"))
                .findAny();

        optional.ifPresentOrElse(
                (s) -> System.out.println(s),
                () -> System.out.println("No String Found")
        );
    }
}
