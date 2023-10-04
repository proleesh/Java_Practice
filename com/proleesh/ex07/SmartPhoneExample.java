package com.proleesh.ex07;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("iPhone", "Deep Blue");

        System.out.println("모델: " + myPhone.model);
        System.out.println("색상: " + Phone.color);

        myPhone.setWifi(true);

        System.out.println("Wi-Fi status: " + myPhone.wifi);


        myPhone.bell();
        myPhone.sendVoice("여보세요");
        myPhone.receiveVoice("안녕하세요. Apple 고객센터입니다.");
        myPhone.hangUp();
        myPhone.internet();
    }
}
