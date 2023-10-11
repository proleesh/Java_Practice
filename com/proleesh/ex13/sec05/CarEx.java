package com.proleesh.ex13.sec05;

public class CarEx {
    public static void main(String[] args) {
        Car c1 = new BMW();
        c1.brand("BMW");
        c1.run();

        // 타입 변환
        BMW bmw = (BMW) c1;
        bmw.speed(120);

    }
}
