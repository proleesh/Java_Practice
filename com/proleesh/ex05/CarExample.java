package com.proleesh.ex05;

public class CarExample {
    public static void main(String[] args) {
        Car c1 = new Car();

        c1.setGas(5);
        if(c1.isLeftGas()){
            System.out.println("Start.");
            c1.run();
        }
    }
}
