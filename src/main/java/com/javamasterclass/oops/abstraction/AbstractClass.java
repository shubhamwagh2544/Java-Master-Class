package com.javamasterclass.oops.abstraction;

abstract public class AbstractClass {               // abstract class :> can't be instantiated
    private String abstractName;                    // private field
    /*
            public constructor :> abstract class can have constructor
            WHY : to initialise its fields :> they are initialised & used through subclass
     */
    public AbstractClass(String abstractName) {
        this.abstractName = abstractName;
    }

    public String getAbstractName() {               // getter
        return abstractName;
    }

    public void setAbstractName(String abstractName) {      // setter
        this.abstractName = abstractName;
    }

    public void sayHi() {                               // non-abstract method
        System.out.println("Abstract said Hi");
    }
    abstract public void sayHello();                    // abstract method
}
