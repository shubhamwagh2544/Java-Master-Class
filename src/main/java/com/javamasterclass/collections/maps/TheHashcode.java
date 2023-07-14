package com.javamasterclass.collections.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TheHashcode {
    public static void main(String[] args) {
        Map<Person, Diamond> map = new HashMap<>();
        map.put(new Person("jamie"), new Diamond("indian diamond"));

        //before overriding hashcode
        System.out.println(map.get(new Person("jamie")));       // returns null

        // for this to work, we will have to override hashcode
        System.out.println(new Person("jamie").hashCode());     // same hashcode
        System.out.println(new Person("jamie").hashCode());     // same hashcode
        System.out.println(map.get(new Person("jamie")));       // indian diamond

    }
    static class Person {
        String name;
        public Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }

        //overriding hashcode
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
    record Diamond(String name) {}
}
