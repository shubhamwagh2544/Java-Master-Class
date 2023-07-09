package com.javamasterclass.aceessmodifiers.private_mod;

public class TestPrivate {
    public static void main(String[] args) {
        System.out.println(
                """
                        only public things are accessible everywhere.
                        Since all props and methods are declared private in MainPrivate
                        nothing is accessible from MainPrivate
                """
        );

        //main class
        MainPrivate mainPrivate = new MainPrivate();
        mainPrivate.call();     //public method only

        //inner class
        MainPrivate.Inner inner = new MainPrivate.Inner();
        inner.innerMethod();    //public method only
    }
}
