package com.proleesh.ex12.interfacetest;

public class Robot implements RemoteControl{
    @Override
    public void turnOn() {
        System.out.println("Robot를 작동 시킨다.");
    }
}
