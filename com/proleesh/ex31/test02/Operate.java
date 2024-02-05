package com.proleesh.ex31.test02;

public class Operate implements Operation{
    double num_A;
    double num_B;

    public double getNum_A() {
        return num_A;
    }

    public void setNum_A(double num_A) {
        this.num_A = num_A;
    }

    public double getNum_B() {
        return num_B;
    }

    public void setNum_B(double num_B) {
        this.num_B = num_B;
    }

    @Override
    public double Add() {

        return num_A + num_B;
    }

    @Override
    public double Sub() {
        if(num_A > num_B) {
            return num_A - num_B;
        }else{
            return num_B - num_A;
        }
    }
}
