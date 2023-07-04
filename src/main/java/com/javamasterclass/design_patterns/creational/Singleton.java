package com.javamasterclass.design_patterns.creational;

class SingleTonInstance {
    private final String name;
    private static final SingleTonInstance singleTonInstance = new SingleTonInstance();

    private SingleTonInstance() {
         name = "Shubham Wagh";
    }

    @Override
    public String toString() {
        return "SingleTonInstance{" +
                "name='" + name + '\'' +
                '}';
    }

    public static synchronized SingleTonInstance getInstance() {
        return singleTonInstance;
    }

}
public class Singleton {
    public static void main(String[] args) {
        SingleTonInstance instance = SingleTonInstance.getInstance();
        System.out.println(instance);
    }
}
