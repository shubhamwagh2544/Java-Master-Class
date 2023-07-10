package com.javamasterclass.intro;

/*
        Output :
        StringBuffer Time : 402
        StringBuilder Time : 287        -> string builder is much faster than string buffer
 */
public class StringBufferVsBuilderRunTest {

    public static void main(String[] args) {
        //string buffer
        long start = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer("shubham wagh");
        for (int i = 1; i <= 10000000; i++) {
            stringBuffer.append(i);
        }

        System.out.println("StringBuffer Time : " + (System.currentTimeMillis() - start));

        //string builder
        start = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder("shubham wagh");
        for (int i = 1; i <= 10000000; i++) {
            stringBuilder.append(i);
        }

        System.out.println("StringBuilder Time : " + (System.currentTimeMillis() - start));
    }

}
