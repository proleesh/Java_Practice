package com.proleesh.ex27;

public class UsingLambdaAsRunnable {
    public static void main(String[] args) {
        Thread t = new Thread(()-> System.out.println("run(): " + Thread.currentThread().getName()));

        t.run();
        System.out.println("main(): " + Thread.currentThread().getName());
    }
}
