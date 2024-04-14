package com.proleesh.ex33.thread;

public class ThreadTest10 {
    static public void main(String[] args){
        Object object = new Object();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10; ++i){
                    System.out.println(Thread.currentThread().getName() + " " + i);
                    if(i == 5){
                        synchronized (object){
                            try{
                                System.out.println(Thread.currentThread().getName() + " Watting Start...");
                                object.wait(3000);
                            }catch(Exception e){
//                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        });
        t1.start();
        try {
            Thread.sleep(1000);
        }catch(Exception e){
        }
        System.out.println(t1.getName() + "status: " + t1.getState());
    }
}
