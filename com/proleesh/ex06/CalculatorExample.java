package com.proleesh.ex06;

public class CalculatorExample {
    public static void main(String[] args) {

        double res1 = 10 * 10 * Calculator.pi;
        int res2 = Calculator.plus(99,1);
        int res3 = Calculator.minus(99,1);


        System.out.println("결과1: " + res1);
        System.out.println("결과2: " + res2);
        System.out.println("결과3: " + res3);

    }
}
