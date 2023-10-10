package com.proleesh.ex12.sec01;

public class RemoteControlEx {
    public static void main(String[] args) {
        PlayStation5 ps5 = new PlayStation5();
        ps5.turnOn();
        ps5.setVolume(29);
        ps5.setVolume(-2);
        ps5.turnOff();
        Audio audio = new Audio();
        audio.turnOn();
        audio.setVolume(23);
        audio.setVolume(3);
        audio.turnOff();
    }

}
