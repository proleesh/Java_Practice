package com.proleesh.ex25.sec13;

class NewRunnable implements Runnable{
    private int number = 0;

    public NewRunnable(int number){
        System.out.println("Thread-0" + " : Thread Start");
        this.number = number;
    }


    @Override
    public void run() {
        int i = 0;
        while(i < number){
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){

            }
            System.out.println("Thread-0" + i + "\n");
            i++;
        }
        System.out.println("Thread-0" + " : Thread종료");

    }
}
public class NewRunnableTest{
    public static void main(String[] args) {
        new Thread(new NewRunnable(10)).start();
    }
}
