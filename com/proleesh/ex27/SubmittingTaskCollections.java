package com.proleesh.ex27;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class SubmittingTaskCollections {
    private static ExecutorService es = Executors.newFixedThreadPool(4);
    private static List<Callable<String>> callables = new ArrayList<>();

    public static void main(String[] args) {
        callables.add(() -> "A");
        callables.add(() -> "B");
        callables.add(() -> "C");
        callables.add(() -> "D");

//        invokeAny();
        invokeAll();
    }

//    public static void invokeAny(){
//        try{
//            String result = es.invokeAny(callables);
//        }catch (InterruptedException | ExecutionException ex){
//            ex.printStackTrace();
//        }finally {
//            es.shutdown();
//        }
//        System.out.println("Always at the end!");
//    }

    public static void invokeAll(){
        try{
            List<Future<String>> list = es.invokeAll(callables);
            for(Future<String> future:list){
                System.out.println(future.get());
            }
        }catch (InterruptedException | ExecutionException ex){
            ex.printStackTrace();
        }finally {
            es.shutdown();
        }
        System.out.println("Always at the end!");
    }
}
