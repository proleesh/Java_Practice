package com.proleesh.ex28;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueExample {
    public static void main(String[] args) {
        BlockingQueue<String> bq = new LinkedBlockingQueue<>();

        bq.add("A");
        bq.add("B");
        bq.add("C");

        System.out.println(bq.poll()); // delete head and return this value
        System.out.println(bq); // list are changed
        System.out.println(bq.peek()); // return head value but not delete
        System.out.println(bq); // normal

        try{
            bq.offer("D", 100, TimeUnit.MILLISECONDS); // loading list if can be used input this value
            bq.poll(200,TimeUnit.MILLISECONDS); // delete head value B
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(bq);
    }
}
