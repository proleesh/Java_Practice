package com.proleesh.ex12.interfacetest;

public class TVBox implements RemoteControl{
    @Override
    public void turnOn() {
        System.out.println("TV Box를 킨다.");
    }
}
