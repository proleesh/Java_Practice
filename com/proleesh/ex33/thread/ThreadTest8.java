package com.proleesh.ex33.thread;

/**
 * Thread state about BLOCKED
 */
public class ThreadTest8 {
    void main(){
        Object obj = new Object();
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj){
                    while(true){

                    }
                }
            }
        });
        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj){
                    while(true){}
                }
            }
        });

        System.out.println(th.getName() + ":state:" + th.getState());
        System.out.println(th2.getName() + ":state:" + th2.getState());
        th.start();
        System.out.println(th.getName() + ":state:" + th.getState());
        for(int i = 0 ; i < 3000000; ++i){
            // Loading...
        }
        th2.start();

        System.out.println(th2.getName() + ":state:" + th2.getState());
        for(int i = 0 ; i < 3000000; ++i){
            // Loading again...
        }

        System.out.println(th.getName() + ":state:"+ th.getState());
        System.out.println(th2.getName() + ":state:" + th2.getState());

        System.out.println("Main thread: " + Thread.currentThread().getId() + ":state:" + Thread.currentThread().getState());



    }
}
