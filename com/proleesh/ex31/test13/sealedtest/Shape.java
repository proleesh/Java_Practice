package com.proleesh.ex31.test13.sealedtest;

public sealed class Shape permits Circle, Square, Rectangle{
    private Integer width;
    private Integer height;

    public void draw(){
        System.out.println("Drawing Shape");
    }
}
