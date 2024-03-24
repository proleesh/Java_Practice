package com.proleesh.ex33.thread;

/**
 * Thread state about WAITING
 */
public class ThreadTest9 {
    void main(){
        Object obj = new Object();
        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10; i++){
                    System.out.println(Thread.currentThread().getName() + ", i =" + i);
                    if(i == 5){
                        synchronized (obj){
                            try{
                                System.out.println(Thread.currentThread().getName()
                                + "Loading start...");
                                obj.wait();
                            }catch (Exception e){
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        });
        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "running...");
                synchronized (obj){
                    try{
                        System.out.println(Thread.currentThread().getName()
                                +", Send notify for notice");
                        obj.notify();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        });

        th1.start();
        double d = 0;
        for(int i = 0; i < 10000000; ++i){
            d += (Math.PI + Math.E) / (double) i;
        }
        System.out.println(th1.getName() + ":state:" + th1.getState());
        th2.start();
    }
}
