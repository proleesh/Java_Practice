package com.proleesh.ex13.sec06;

public class Car {
    Tire t1 = new MichelinTire();
    Tire t2 = new MichelinTire();
    Tire t3 = new KumhoTire();
    Tire t4 = new KumhoTire();


    void run(){
        System.out.println("작동 시작");
        System.out.println("앞바퀴");
        t1.roll();
        t2.roll();
        System.out.println("뒤바퀴");
        t3.roll();
        t4.roll();
    }

    void stop(){
        System.out.println("작동 멈춤");
    }
}
