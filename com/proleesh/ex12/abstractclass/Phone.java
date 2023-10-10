package com.proleesh.ex12.abstractclass;

public abstract class Phone {
    String owner;
    String brand;
    String broadcast;

    public Phone(String owner, String brand, String broadcast) {
        this.owner = owner;
        this.brand = brand;
        this.broadcast = broadcast;
    }

    void turnOn(){
        System.out.println("폰이 켜진다.");
    }
    void turnOff(){
        System.out.println("폰이 꺼진다.");
    }

    public String getOwner() {
        return owner;
    }

    public String getBrand() {
        return brand;
    }

    public String getBroadcast() {
        return broadcast;
    }
}
