package com.proleesh.ex28;

public class Deadlock {
    public static void go(){
        final String ransom = "ransom";
        final String hostage = "hostage";

        Thread criminals = new Thread(()->{
            synchronized (ransom){
                System.out.println("The criminals have the hostage and want the ransom...");
                try{
                    Thread.sleep(500);
                }catch(InterruptedException e){
                    e.fillInStackTrace();
                }

                synchronized (hostage){
                    System.out.println("The criminals have BOTH!");
                }
            }
        });

        Thread police = new Thread(()->{
            synchronized (ransom){
                System.out.println("The police have the hostage and want the ransom...");
                try{
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                synchronized (hostage){
                    System.out.println("The police have BOTH.");
                }
            }
        });
        criminals.start();
        police.start();
    }

    public static void main(String[] args) {
        go();
    }
}
