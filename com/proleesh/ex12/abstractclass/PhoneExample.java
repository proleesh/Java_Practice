package com.proleesh.ex12.abstractclass;

import java.lang.reflect.Constructor;

public class PhoneExample {
    public static void main(String[] args) throws ClassNotFoundException {
        AppleiPhone ap = new AppleiPhone("사쿠라","애플","SKT");
//        ap.turnOn();
        turnOn(ap);
        ap.AirDrop();
        ap.ApplePay();
//        ap.turnOff();
        turnOff(ap);
        System.out.println("단말기 사용자 이름: " + ap.getOwner() + "," +
                " 단말기 브랜드: " + ap.getBrand() + ", " +
                "통신사: " + ap.getBroadcast() + " 입니다.");
        System.out.println("===============");
        SamsungGalaxyPhone sgp = new SamsungGalaxyPhone("홍길동", "삼성", "KT");
//        sgp.turnOn();
        turnOn(sgp);
        sgp.SamsungPay();
        sgp.CallRecord();
//        sgp.turnOff();
        turnOff(sgp);
        System.out.println("단말기 사용자 이름: " + sgp.getOwner() + "," +
                " 단말기 브랜드: " + sgp.getBrand() + ", " +
                "통신사: " + sgp.getBroadcast() + " 입니다.");

//        Class c = Class.forName("com.proleesh.ex12.abstractclass.PhoneExample");
//        System.out.println(c.getName());
//        System.out.println(c.getClassLoader());

    }

    public static void turnOn(Phone phone){
        phone.turnOn();
    }
    public static void turnOff(Phone phone){
        phone.turnOff();
    }
}
