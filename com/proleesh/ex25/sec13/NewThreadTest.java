package com.proleesh.ex25.sec13;


class NewThread extends Thread{
    private int number = 0;
    public NewThread(int number){
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
            System.out.println("Thread-0 : " + i + "\n");
            i++;
        }
        System.out.println("Thread-0" + " : Thread종료");
    }
}
public class NewThreadTest {
    public static void main(String[] args) {
//        NewThread nt = new NewThread(10);
//        nt.start();
        new NewThread(10).start();
    }
}
