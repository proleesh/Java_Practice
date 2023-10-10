package com.proleesh.ex12.abstractclass;

public class PhoneExample {
    public static void main(String[] args) {
        AppleiPhone ap = new AppleiPhone("사쿠라","애플","SKT");
        ap.turnOn();
        ap.AirDrop();
        ap.ApplePay();
        ap.turnOff();
        System.out.println("단말기 사용자 이름: " + ap.getOwner() + "," +
                " 단말기 브랜드: " + ap.getBrand() + ", " +
                "통신사: " + ap.getBroadcast() + " 입니다.");
        System.out.println("===============");
        SamsungGalaxyPhone sgp = new SamsungGalaxyPhone("홍길동", "삼성", "KT");
        sgp.turnOn();
        sgp.SamsungPay();
        sgp.CallRecord();
        sgp.turnOff();
        System.out.println("단말기 사용자 이름: " + sgp.getOwner() + "," +
                " 단말기 브랜드: " + sgp.getBrand() + ", " +
                "통신사: " + sgp.getBroadcast() + " 입니다.");

    }
}
