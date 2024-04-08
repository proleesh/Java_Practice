package com.proleesh.ex31.assign;

public class Circle extends Shape {
    final double PI = 3.1415;
    int r = 0;

    public void setR(int r){
        this.r = r;
    }

    @Override
    public int area() {
        res = (int)PI * r * r;
        return res;
    }
}
