package com.javamasterclass.codetest;

interface Lambda {
    void run();
}

public class LambdaTest {
    public void testLambda(Lambda lambda) {
        lambda.run();
    }

    public static void main(String[] args) {
        //one way
        Lambda lambda = () -> System.out.println("simple execution of lambda");

        //second way
        Lambda lambda1 = new Lambda() {
            public void run() {
                System.out.println("another simple execution of lambda");
            }
        };

        LambdaTest lambdaTest = new LambdaTest();
        lambdaTest.testLambda(lambda);          // through lambda way
        lambdaTest.testLambda(lambda1);         // through anonymous inner class way

    }
}
