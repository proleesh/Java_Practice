package com.proleesh.ex28;

public class SynchronizedExample {
    private static Object lock = new Object();
    private static int count = 0;


    public void addToCounter(){
        synchronized (lock) {
            int c = count;
            System.out.println("Before. " + count + ". Thread name: " + Thread.currentThread().getName());
            count = c + 1;
            System.out.println("After. " + count + ". Thread name: " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        SynchronizedExample instance = new SynchronizedExample();

        for(int i = 1; i <= 10; ++i){
            new Thread(instance::addToCounter)
                    .start();
        }
    }
}
