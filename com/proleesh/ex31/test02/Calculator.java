package com.proleesh.ex31.test02;

public class Calculator {
    public static void main(String[] args) {
        Operate op = new Operate();
        op.setNum_A(100.2);
        op.setNum_B(2.42);

        double numA = op.getNum_A();
        double numB = op.getNum_B();

        // Traditional
        System.out.println((numA + numB));
        System.out.println((numA - numB));

        // Using Interface (Liskov Substitution Principle, Open-Close Principle, Single Responsibility Principle, Dependency Inversion Principle)
        System.out.println(op.Add());
        System.out.println(op.Sub());
    }
}
