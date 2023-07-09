package com.javamasterclass.aceessmodifiers.private_mod;

public class MainPrivate {
    private static final String name = "shubham wagh";        // private only accessible in the same class

    private static void sayName() {
        System.out.println(name);
    }

    private static void main(String[] args) {       //same signature as main method but private access
        System.out.println(name);
    }

    public void call() {
        String[] args = {"ignore", "this", "inputs"};
        sayName();
        main(args);

        //call to inner class
        Inner inner = new Inner();
        inner.sayName();
        inner.call();
    }

    /*
            Main class private methods, args are accessible with same inner class.
            Inner class private methods are accessible inside main class ( but not private args )
     */
    static class Inner {
        private static String name;             //not accessible inside main class
        Inner() { name = "shubham"; }
        private void sayName() {                //accessible inside main class
            System.out.println("calling inner class method");
            System.out.println(name);
            System.out.println(MainPrivate.name);
            MainPrivate.sayName();
        }
        private static void call() {
            System.out.println("private static method called");
        }
        public void innerMethod() {
            System.out.println("public inner method");
        }
    }

}
