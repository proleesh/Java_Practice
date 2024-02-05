package com.proleesh.ex31.test01;

public class Calculator {
    public static void main(String[] args) {
        Operation op = new Operation();
        op.setNumA(12);
        op.setNumB(24);

        double numA = op.getNumA();
        double numB = op.getNumB();

        Operation add = new Adder();
        System.out.println(numA + " + " + numB + " = " + add.operate(numA, numB));

        Operation sub = new Subtractor();
        if(numA > numB) {
            System.out.println(numA + " - " + numB + " = " + sub.operate(numA, numB));
        }else {
            System.out.println(numB + " - " + numA + " = " + sub.operate(numA, numB));
        }
    }
}
