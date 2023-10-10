package com.proleesh.ex12.interfacetest;

public class PS5 implements RemoteControl{
    @Override
    public void turnOn() {
        System.out.println("PS5를 킨다.");
    }
}
