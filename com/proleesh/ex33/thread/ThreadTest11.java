package com.proleesh.ex33.thread;

import java.util.concurrent.TimeUnit;

public class ThreadTest11 {
    void main(){
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                double d = 0;
                for(int i = 0; i < 1000; ++i){
                    d += (Math.PI + Math.E) / (double) i;
                }
            }
        });
        t1.start();
        try{
//            Thread.sleep(2000);
            TimeUnit.MILLISECONDS.sleep(2000);
        }catch(Exception e){}
        System.out.println("t1 Thread status: " + t1.getState());
    }
}
