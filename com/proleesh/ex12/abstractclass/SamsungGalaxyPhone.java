package com.proleesh.ex12.abstractclass;

public class SamsungGalaxyPhone extends Phone{

    public SamsungGalaxyPhone(String owner, String brand, String broadcast) {
        super(owner, brand, broadcast);
    }

    @Override
    void turnOn() {
//        super.turnOn();
        System.out.println("삼성 갤럭시가 켜진다.");
    }

    @Override
    void turnOff() {
//        super.turnOff();
        System.out.println("삼성 갤럭시가 꺼진다.");
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

    public void SamsungPay(){
        System.out.println("Samsung Pay 기능 활성");
    }
    public void CallRecord(){
        System.out.println("통화 녹음 기능 활성");
    }
}
