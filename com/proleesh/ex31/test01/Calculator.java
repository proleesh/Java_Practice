package com.proleesh.ex31.test01;

public class Calculator {
    public static void main(String[] args) {
        Operation op = new Operation();
        op.setNumA(12);
        op.setNumB(24);

        Adder add = new Adder();
        double numA = op.getNumA();
        double numB = op.getNumB();
        System.out.println(numA + " + " + numB + " = " + add.operate(numA, numB));

        Subtractor sub = new Subtractor();
        if(numA > numB) {
            System.out.println(numA + " - " + numB + " = " + sub.operate(numA, numB));
        }else {
            System.out.println(numB + " - " + numA + " = " + sub.operate(numA, numB));
        }
    }
}
