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
    /*
            synchronized : allowing only one thread to execute at any given time
                         : mechanism to avoid race conditions by synchronizing thread access to shared data
            race condition :
                        it occurs when two or more threads attempt to update mutable shared data at the same time
     */

}
public class Singleton {
    public static void main(String[] args) {
        SingleTonInstance instance = SingleTonInstance.getInstance();
        System.out.println(instance);
    }
}
