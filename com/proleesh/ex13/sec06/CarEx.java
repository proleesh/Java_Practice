package com.proleesh.ex13.sec06;

public class CarEx {
    public static void main(String[] args) {
        Car car = new Car();
        car.run();
        car.stop();

        System.out.println();
        System.out.println("앞바퀴 교체: ");
        car.t1 = new KumhoTire();
        car.t2 = new KumhoTire();
        car.run();
        car.stop();

    }
}
