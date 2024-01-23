package com.proleesh.ex28;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    private static int count = 0;
    private static Lock lock = new ReentrantLock();

    public static void addToCounter(){
        if(lock.tryLock()){
            try{
                int c = count;
                System.out.println("Before. " + count + ". Thread id: " + Thread.currentThread().getId());
                count = c + 1;
                System.out.println("After. " + count + ". Thread id: " + Thread.currentThread().getId());
            }finally{
                lock.unlock();
            }
        }else{
            System.out.println("Failed to get lock....");
        }
    }

    public static void main(String[] args) {
        for(int i = 1; i <=10 ; ++i){
            new Thread(LockExample::addToCounter)
                    .start();
        }
    }
}
