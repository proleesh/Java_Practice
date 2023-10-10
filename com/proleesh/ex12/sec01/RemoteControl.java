package com.proleesh.ex12.sec01;

public interface RemoteControl {
    void turnOn();
    void turnOff();

    void setVolume(int volume);
    int MAX_VOLUME = 25;
    int MIN_VOLUME = 0;
}
