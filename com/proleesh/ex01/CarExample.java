package com.proleesh.ex01;

public class CarExample {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.model = "BMW";
        car1.speed = 250;
        car1.start = true;
        System.out.println("모델: " + car1.model);
        System.out.println("최고 속도: " + car1.speed);
        System.out.println("시작 여부: " + car1.start);
    }
}
