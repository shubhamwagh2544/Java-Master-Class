package com.javamasterclass.npe;

public class NPE {
    /*
            NPE : subclass of RunTimeException
            arises when operation performed on NULL object
     */
    public static void main(String[] args) {
        String name = null;
        //System.out.println(name.toUpperCase());         // will throw NPE bcz name is null

        Cat cat = new Cat("jamie");
        cat = null;
        System.out.println(cat.toString());             // will throw NPE bcz cat is null
    }
}
class Cat {
    String name;
    Cat(String name) {
        this.name = name;
    }
}
