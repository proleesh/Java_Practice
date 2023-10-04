package com.proleesh.ex07;

public class Tringle{
    double height;
    double width;

    public Tringle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double findArea(){
        return ((height * width) / 2);
    }

    public String isSameArea(Tringle t){
        return this.findArea() == t.findArea() ? "같 습니다." : "같지않 습니다.";
    }
}
