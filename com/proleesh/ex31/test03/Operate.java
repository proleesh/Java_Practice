package com.proleesh.ex31.test03;

public class Operate implements  Operation{

    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double sub(double a, double b) {
        if(a > b){
            return a - b;
        }else{
            return b - a;
        }
    }
}
