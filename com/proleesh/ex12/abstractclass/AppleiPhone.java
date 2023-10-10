package com.proleesh.ex12.abstractclass;

public class AppleiPhone extends Phone{
    public AppleiPhone(String owner, String brand, String broadcast) {
        super(owner, brand, broadcast);
    }

    @Override
    public String getOwner() {
        return super.getOwner();
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public String getBroadcast() {
        return super.getBroadcast();
    }

    @Override
    void turnOn() {
//        super.turnOn();
        System.out.println("애플 아이폰이 켜진다.");
    }

    @Override
    void turnOff() {
//        super.turnOff();
        System.out.println("애플 아이폰이 꺼진다.");
    }

    public void AirDrop(){
        System.out.println("AirDrop 기능 활성.");
    }
    public void ApplePay(){
        System.out.println("Apple Pay 기능 활성");
    }
}
