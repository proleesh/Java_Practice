package com.proleesh.ex12.interfacetest;

public class Television implements RemoteControl{
    @Override
    public void turnOn() {
        System.out.println("텔레비즌을 킨다.");
    }
}
