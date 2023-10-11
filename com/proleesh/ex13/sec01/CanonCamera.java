package com.proleesh.ex13.sec01;

public class CanonCamera implements RemoteControl {

    private int volume;

    @Override
    public void turnOn() {
        System.out.println("캐논 카메라가 켜진다.");
    }

    @Override
    public void turnOff() {
        System.out.println("캐논 카메라가 꺼진다.");
    }

    @Override
    public void setVolume(int volume) {
        if(volume < RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        }else if(volume > RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        }else{
            this.volume = volume;
        }
        System.out.println("현재 볼륨: " + volume);
    }
    private int memoVol;
    @Override
    public void setMute(boolean mute) {
//        RemoteControl.super.setMute(mute);
        if(mute){
            this.memoVol = this.volume;
            System.out.println("무음 모드 활성화");
            setVolume(RemoteControl.MIN_VOLUME);
        }else{
            System.out.println("무음 모드 해제");
            setVolume(this.memoVol);
        }
    }
}
