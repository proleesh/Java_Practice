package com.proleesh.ex13.sec06;

public class CarEx {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("앞바퀴: ");
        car.t1.roll();
        car.t2.roll();
        System.out.println("뒤바퀴: ");
        car.t3.roll();
        car.t4.roll();
        car.run();
        car.stop();

        System.out.println();
        System.out.println("앞바퀴 교체: ");
        car.t1 = new KumhoTire();
        car.t2 = new KumhoTire();

        System.out.println("[new]앞바퀴: ");
        car.t1.roll();
        car.t2.roll();
        System.out.println("뒤바퀴: ");
        car.t3.roll();
        car.t4.roll();
        car.run();
        car.stop();

    }
}
