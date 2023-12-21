package com.proleesh.ex27;

class CountDown_ implements Runnable{
    String[] lang = {"Java", "Rust", "C++", "Python", "JavaScript"};

    @Override
    public void run() {
        for(int i = 4; i >= 0; --i){
            try{
                System.out.println(lang[i]);
                Thread.sleep(3000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("【End】");
    }
}
public class TimeBomb2 {
    public static void main(String[] args) {
        Thread testThread = new Thread(new CountDown_());
        System.out.println("Test: ");
        testThread.start();
        System.out.println("【Start】");
    }
}
