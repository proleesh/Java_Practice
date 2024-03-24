package com.proleesh.ex33.thread;

public class ThreadTest3 {
    void main(){
        Thread t1 = new Thread(new RunnableWithThread(1));
        Thread t2 = new Thread(new RunnableWithThread(2));
        Thread t3 = new Thread(new RunnableWithThread(3));
        Thread t4 = new Thread(new RunnableWithThread(4));
        Thread t5 = new Thread(new RunnableWithThread(5));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}

class RunnableWithThread implements Runnable{

    private int num;

    public RunnableWithThread(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println(num + " Thread was running...");
    }
}
