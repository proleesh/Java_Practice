package com.proleesh.ex27;

class CountDown implements Runnable{
    String[] timeStr = {
            "Zero", "One", "Two", "Three", "Four", "Five", "Six",
            "Seven", "Eight", "Nine"
    };

    @Override
    public void run() {
        for(int i = 9; i >= 0; --i){
            System.out.println(timeStr[i]);
        }
    }
}
public class TimeBomb {
    public static void main(String[] args) {
        Thread timer = new Thread(new CountDown_());
        System.out.println("Starting 10 seconds count down... ");
        timer.start();
        System.out.println("Boom!!!");
    }
}
