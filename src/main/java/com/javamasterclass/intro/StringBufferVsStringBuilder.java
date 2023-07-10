package com.javamasterclass.intro;

class StringBufferThread extends Thread {
    StringBuffer stringBuffer;
    StringBufferThread(StringBuffer stringBuffer) {
        this.stringBuffer = stringBuffer;
    }

    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            stringBuffer.append(i);
        }
    }
}

class StringBuilderThread extends Thread {
    StringBuilder stringBuilder;
    StringBuilderThread(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            stringBuilder.append(i);
        }
    }
}

public class StringBufferVsStringBuilder {
    public static void main(String[] args) throws InterruptedException {
        /*
                String is immutable
                StringBuffer and StringBuilder are mutable

                StringBuffer - Java1.0 - thread safe - synchronized - multiple threads can safely operate simultaneously - slower
                StringBuilder - Java1.5 - same as ditto as StringBuffer but - not thread safe - faster

                Output :
                The value of string builder is varying over different runs of the same program whereas string buffer value remains the same.
                It means, string buffer is thread-safe and string builder is not.
         */

        //string buffer
        for (int i = 1; i <= 5; i++) {
            StringBuffer stringBuffer = new StringBuffer();
            System.out.println(stringBuffer.capacity());

            stringBuffer.append("shubham wagh");
            System.out.println(stringBuffer);

            StringBufferThread stringBufferThread1 = new StringBufferThread(stringBuffer);
            StringBufferThread stringBufferThread2 = new StringBufferThread(stringBuffer);
            StringBufferThread stringBufferThread3 = new StringBufferThread(stringBuffer);

            stringBufferThread1.start();
            stringBufferThread2.start();
            stringBufferThread3.start();
            stringBufferThread1.join();
            stringBufferThread2.join();
            stringBufferThread3.join();

            System.out.println("StringBuffer : " + stringBuffer.length());          //printing string buffer after 3 threads executing on it
        }

        //string builder
        for (int i = 1; i <= 5; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            System.out.println(stringBuilder.capacity());

            stringBuilder.append("shubham wagh");
            System.out.println(stringBuilder);

            StringBuilderThread stringBuilderThread1 = new StringBuilderThread(stringBuilder);
            StringBuilderThread stringBuilderThread2 = new StringBuilderThread(stringBuilder);
            StringBuilderThread stringBuilderThread3 = new StringBuilderThread(stringBuilder);

            stringBuilderThread1.start();
            stringBuilderThread2.start();
            stringBuilderThread3.start();
            stringBuilderThread1.join();
            stringBuilderThread2.join();
            stringBuilderThread3.join();

            System.out.println("StringBuilder : " + stringBuilder.length());      //printing string buffer after 3 threads executing on it
        }
    }
}
