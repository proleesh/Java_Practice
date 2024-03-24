package com.proleesh.ex33.thread;

/**
 * Thread state about RUNNABLE
 */
public class ThreadTest7 {
    void main(){
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + ":state:" + Thread.currentThread().getState());
                System.out.println(Thread.currentThread().getId()+"-My mission was start...");
                System.out.println(Thread.currentThread().getName() + ":state:" + Thread.currentThread().getState());
            }
        });
        th.start();
        System.out.println(th.getName() + ":state:" + th.getState());
        System.out.println("Main thread: " + Thread.currentThread().getId());
    }
}
