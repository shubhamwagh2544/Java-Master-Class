package com.javamasterclass.code;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class OuterClass {
    private int outerField;

    //Inner Class : Non-Static
    class Inner {
        public void doSomething() {
            System.out.println("Inner class has access to instance members of outer class (even private): " + outerField);
        }
    }

    //Static Nested Class
    static class InnerStatic {
        public void doSomething() {
            System.out.println("Static nested class : no access to instance-specific members of outer class");
        }
    }
}

public class StaticVSNonStaticClass {
    public static void main(String[] args) {
        // Inner class instance requires an outer class instance
        OuterClass outerClass = new OuterClass(5);
        OuterClass.Inner inner = outerClass.new Inner();
        inner.doSomething();

        // Static nested class instance doesn't require an outer class instance
        OuterClass.InnerStatic innerStatic = new OuterClass.InnerStatic();
        innerStatic.doSomething();
    }
}
