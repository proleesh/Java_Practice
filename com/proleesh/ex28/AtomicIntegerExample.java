package com.proleesh.ex28;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {
    private static AtomicInteger atomicCounter = new AtomicInteger(0);

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(5);
        for(int i = 1; i <= 10; ++i){
            es.submit(()-> System.out.println(atomicCounter.incrementAndGet() + ""));
        }
        es.shutdown();
    }
}
