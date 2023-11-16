package com.javamasterclass.code;

import java.nio.charset.StandardCharsets;

public class ByteToString {
    public static void main(String[] args) {
        byte[] byteArray = { 72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100 };

        //Default encoding
        String s1 = new String(byteArray);
        System.out.println("String from byte array (default encoding): " + s1);

        //UTF_8 encoding
        String s2 = new String(byteArray, StandardCharsets.UTF_8);
        System.out.println("String from byte array (UTF-8 encoding): " + s2);

        //US_ASCII encoding
        String s3 = new String(byteArray, StandardCharsets.US_ASCII);
        System.out.println("String from byte array (US-ASCII encoding): " + s3);

        //UTF_16 encoding
        String s4 = new String(byteArray, StandardCharsets.UTF_16);
        System.out.println("String from byte array (UTF-16 encoding): " + s4);

        //String to Bytes Array
        byte[] bytes = s1.getBytes();       //default charset : Charset.defaultCharset()
        for (byte b : bytes) {
            System.out.print(b + " ");
        }
    }
}
