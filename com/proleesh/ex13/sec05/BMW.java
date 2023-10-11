package com.proleesh.ex13.sec05;

public class BMW implements Car{
    private String brandName;
    private int speed;

    @Override
    public void brand(String brandName) {
        this.brandName = brandName;
        System.out.println("브랜드: " + brandName);
    }

    @Override
    public void run() {
        System.out.println(this.brandName + "가 달린다.");
    }

    void speed(int speed){
        this.speed = speed;
        System.out.println(this.brandName + "의" +
                " 현재 속도는 " + this.speed + "km/h로 달린다.");
    }
}
