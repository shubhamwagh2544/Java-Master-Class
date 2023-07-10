package com.javamasterclass.intro;

public class StringBufferVsBuilder {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();

        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 100000; i++) {
                stringBuffer.append("shubham");
                stringBuilder.append("shubham");
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= 100000; i++) {
                stringBuffer.append("wagh");
                stringBuilder.append("wagh");
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(stringBuffer.length());              //same output for each run -> stringbuffer is thread safe
        System.out.println(stringBuilder.length());             //output varies for each run -> stringbuilder is not thread safe
    }
}
