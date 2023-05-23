package com.javamasterclass.npe;

import java.util.Optional;

public class GoodCode {
    /*
            Optional API :
            Container object which may or may not contain a non-null value.
            If a value is present, isPresent() will return true and get() will return the value.
            1. of : Returns an Optional with the specified present non-null value.
            2. ofNullable : Returns an Optional describing the specified present non-null value,
               otherwise returns an empty Optional.
     */
    public static void main(String[] args) {
        String name = null;
        Optional<String> nameOptional = Optional.ofNullable(name);
        System.out.println(nameOptional.isEmpty());
        nameOptional.ifPresent(System.out::println);                //since name is null, it returns empty optional

        if (nameOptional.isPresent()) {
            System.out.println(nameOptional.get());
        }
        else {
            System.out.println("Optional is empty");
        }

        nameOptional.ifPresentOrElse(
                (s) -> System.out.println(s),
                () -> System.out.println("Optional is empty")
        );

        var replacement_string = nameOptional.orElse("replacement_string");
        System.out.println(replacement_string);
    }
}
