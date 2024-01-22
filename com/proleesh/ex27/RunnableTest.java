package com.proleesh.ex27;

import java.util.concurrent.*;

public class RunnableTest {
    public static void main(String[] args) {
        ExecutorService es = Executors.newSingleThreadExecutor();

        es.execute(() -> System.out.println("Runnable example"));

        Future<Integer> future = es.submit(() -> 3 + 5);

        try{
            System.out.println("The answer is: " + future.get(500, TimeUnit.MILLISECONDS));
        }catch (InterruptedException | ExecutionException | TimeoutException ex){
            ex.printStackTrace();
        }

        es.shutdown();
    }
}
