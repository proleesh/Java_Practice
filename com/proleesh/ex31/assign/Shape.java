package com.proleesh.ex31.assign;

public class Shape {
    int x, y, h; // 가로, 세로, 높이

    int res;

    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void setH(int h){
        this.h = h;
    }

    public int area(){
        res = x * y;
        return res;
    }
}
