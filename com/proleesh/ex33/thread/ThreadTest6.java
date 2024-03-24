package com.proleesh.ex33.thread;

/**
 * Thread state about NEW
 */
public class ThreadTest6 {
    void main(){
        Thread th = new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"-My mission was start...");
            }
        });
        System.out.println(th.getName() + ":state:"+th.getState());
        System.out.println("Main thread: " + Thread.currentThread().getId());
    }
}
