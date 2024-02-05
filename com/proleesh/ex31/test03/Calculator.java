package com.proleesh.ex31.test03;

public class Calculator {
    public static void main(String[] args) {
        Operation op = new Operate();
        System.out.println(op.add(100.24, 242.52));
        System.out.println(op.sub(100.24, 242.52));

    }
}
