package com.proleesh.ex13;

public class CanonCamera implements RemoteControl{

    @Override
    public void turnOn() {
        System.out.println("캐논 카메라가 켜진다.");
    }

    @Override
    public void turnOff() {
        System.out.println("캐논 카메라가 꺼진다.");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("현재 볼륨: " + volume);
    }
}
