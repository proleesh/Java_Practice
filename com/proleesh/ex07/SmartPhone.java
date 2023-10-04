package com.proleesh.ex07;

public class SmartPhone extends Phone{
    public boolean wifi;

    public SmartPhone(String model, String color){
        this.model = model;
        Phone.color = color;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        if(wifi) {
            System.out.println("Wi-Fi 연결된 상태 입니다.");
        }
    }

    public void internet(){
        System.out.println("인터넷에 연결합니다.");
    }
}
