package com.proleesh.ex12.interfacetest;

public interface RemoteControl {
    // 추상 메서드 abstract 생략 가능
//    public abstract void turnOn();
    void turnOn();
    public static final int MAX_VOLUME = 25;
    int MIN_VOLUME = 0; // static final의 특성을 가진다.
}
