package com.proleesh.ex31.test01;

public class Subtractor extends Operation{
    @Override
    public double operate(double numA, double numB) {
        if(numA > numB){
            return numA - numB;
        }else{
            return numB - numA;
        }
    }
}
