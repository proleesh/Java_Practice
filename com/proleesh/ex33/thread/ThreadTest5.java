package com.proleesh.ex33.thread;

public class ThreadTest5 {
    void main(){
        RunnableWithThread3 rwt3 = new RunnableWithThread3();
        Thread th = new Thread(rwt3);
        th.start();
//        th.start(); IllegalThreadStateException because duplicate recall
//        th.run();
        System.out.println("Main thread: " + Thread.currentThread().getId());

    }
}

class RunnableWithThread3 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getId() + "-My mission was start...");
    }
}
