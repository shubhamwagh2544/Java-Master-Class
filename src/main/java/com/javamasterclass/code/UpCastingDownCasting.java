package com.javamasterclass.code;

class Animall {
    public void makesound() {
        System.out.println("BaseClass : Animal");
    }
}

class Dogg extends Animall {
    public void bark() {
        System.out.println("SubClass : Dog");
    }
}

public class UpCastingDownCasting {
    public static void main(String[] args) {
        Animall animall = new Dogg();               // UpCasting
        animall.makesound();                        //base class method calling

        if (animall instanceof Dogg) {              // DownCasting
            Dogg dogg = (Dogg) animall;
            dogg.bark();                            // sub class method calling
        }
    }
}