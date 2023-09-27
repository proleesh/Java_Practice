package com.proleesh.ex06;

public class Car {
    String name;
    int speed;

    public Car(){}
    public Car(String name){
        this.name = name;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    void run(){
        setSpeed(100);
        System.out.println("차의 브랜드: " + this.name);
        System.out.println("차의 속도: " + this.speed + "km/h");
    }

}
