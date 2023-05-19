package com.javamasterclass.intro;

public class GlobalLocalVariables {
    private static final String FIRST_NAME = "Shubham";     // globally available to class
    public static final String LAST_NAME = "Wagh";          // globally available to all
    // can be accessed by outside classes also

    public static void main(String[] args) {
        System.out.println(FIRST_NAME);
        System.out.println(LAST_NAME);
    }

}
