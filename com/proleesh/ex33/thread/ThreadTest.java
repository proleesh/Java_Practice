package com.proleesh.ex33.thread;

public class ThreadTest {
    void main() {
        // Mission create
        MyRunnable mr = new MyRunnable();

        // Thread start, start mission request.
        new Thread(mr).start();


    }
}
// Realise Runnable interface, definition a mission.
class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("My thread mission was start...");
    }
}
