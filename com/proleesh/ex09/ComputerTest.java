package com.proleesh.ex09;

public class ComputerTest {
    public static void main(String[] args) {
        int r = 10;

        Calculator calculator = new Calculator();
        System.out.println("원 면적: "+calculator.areaCircle(r));
        System.out.println();
    }
}
