package com.javamasterclass.collections.sets;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class TheSets {
    /*
            What is Set :
            : container that holds no duplicate objects
            : i.e. no two elements e1 and e2 in set are such that e1.equals(e2)
              and most one null element
     */
    public static void main(String[] args) {
        Set<Ball> set = new HashSet<>();
        set.add(new Ball("red"));
        set.add(new Ball("green"));
        set.add(new Ball("blue"));
        set.add(new Ball("blue"));

        // for record Ball
        //System.out.println(set.size());         // 3 : no duplicates allowed
        //set.forEach(System.out::println);

        // No Get method in sets because order is random in sets
        // Set is backed by Map (HashMap) of <E, Object>
        set.remove(new Ball("green"));

        // for class Ball
        System.out.println(set.size());         // 4 : for class, it will show all 4 as diff objects
        set.forEach(System.out::println);
        // In case of class, we will have to override equals and hashcode method
        // Now after overriding equals and hashcode : it will not allow duplicate objects
    }
    //record Ball(String color) {}
    static class Ball {
        String color;
        public Ball(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "Ball{" +
                    "color='" + color + '\'' +
                    '}';
        }

        //overriding equals and hashcode

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Ball ball = (Ball) o;
            return Objects.equals(color, ball.color);
        }

        @Override
        public int hashCode() {
            return Objects.hash(color);
        }
    }
}