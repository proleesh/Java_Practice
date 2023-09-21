package com.proleesh.ex05;

public class Car {
    int gas;

    void setGas(int gas){
        this.gas = gas;
    }

    boolean isLeftGas(){
        if(gas == 0){
            System.out.println("Gas가 없습니다.");
            return false;
        }
        System.out.println("Gas가 남았습니다.");
        return true;
    }

    void run(){
        while(true) {
            if (gas > 0) {
                System.out.println("Run. Gas잔여량 = " + gas);
                gas -= 1;
            } else {
                System.out.println("Stop. Gas잔여량 = " + gas);
                return;
            }
        }
    }
}
