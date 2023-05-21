package com.javamasterclass.oops.encapsulation;

public class Encapsulation {
    /*
            What is encapsulation ?
            1. process of binding object state and behaviour together into one single unit
               i.e. wrapping of data & code together
            2. we can make class attributes hidden from other classes using encapsulation
               i.e. one class hidden from another class
            3. prevent classes from being tightly coupled
            4. easily modify the behaviour / inner content of any class without modifying rest of program
            5. Java provides by default encapsulation using classes
               :> We got Full Control over encapsulation to make it robust.
     */

    public static void main(String[] args) {
        Square square = new Square(10);
        System.out.println(square.getSide());
        square.setSide(15);
        System.out.println(square.square());    //225
    }
}

class Square {              // object state and object behaviour is bundled together into single unit
    private int side;       // data hiding :> by declaring fields private (to outside classes)

    public int getSide() {      //getter to get value
        return side;
    }

    public void setSide(int side) {     //setter to set value
        this.side = side;
    }

    public Square(int side) {
        this.side = side;
    }

    public int square() {
        return side*side;
    }
}
