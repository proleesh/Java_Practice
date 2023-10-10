package com.proleesh.ex12.sec01;


public class PlayStation5 implements RemoteControl {
    private int volume;
    @Override
    public void turnOn() {
        System.out.println("PS5를 킨다.");
    }

    @Override
    public void turnOff() {
        System.out.println("PS5를 끄다.");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        }else if(volume < RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        }else{
            this.volume = volume;
        }
        System.out.println("현재 PS5 불륨: " + this.volume);
    }


}
