package com.proleesh.ex13.sec06;

public class Car {
    Tire t1 = new MichelinTire();
    Tire t2 = new MichelinTire();
    Tire t3 = new KumhoTire();
    Tire t4 = new KumhoTire();


    void run(){
        System.out.println("작동 시작");
    }

    void stop(){
        System.out.println("작동 멈춤");
    }
}
