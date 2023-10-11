package com.proleesh.ex13.sec01;

public class RemoteControlEx {
    public static void main(String[] args) {
        RemoteControl rc;
        rc = new CanonCamera();

        rc.turnOn();
        rc.setVolume(2);
        rc.setMute(true);
        rc.setMute(false);
        rc.turnOff();
        RemoteControl.changeBattery();

        rc = new Audio();
        rc.turnOn();
        rc.setVolume(8);
        rc.setMute(true);
        rc.setMute(false);
        rc.turnOff();
        RemoteControl.changeBattery();
    }
}
