package com.proleesh.ex12.interfacetest;

public class RemoteControlEx {
    public static void main(String[] args) {
        RemoteControl rc;
        rc = new Television();
//        RemoteControl rc = new Television();
        rc.turnOn();

        rc = new TVBox();
        rc.turnOn();

        rc = new PS5();
        rc.turnOn();

        rc = new Robot();
        rc.turnOn();

    }
}
