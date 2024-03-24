package com.proleesh.ex33.thread;

public class ThreadTest2 {
    void main(){
        MyThread mt = new MyThread();
        mt.start();
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Thread running...");
    }
}