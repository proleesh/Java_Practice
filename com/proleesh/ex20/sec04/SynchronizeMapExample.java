package com.proleesh.ex20.sec04;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizeMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>());

        Thread threadA = new Thread(){
            @Override
            public void run() {
                for(int i=1;i <= 1000; ++i){
                    map.put(i, "내용" + i);
                }
            }
        };
        Thread threadB = new Thread(){
            @Override
            public void run() {
                for(int i=1001;i <= 2000; ++i){
                    map.put(i, "내용" + i);
                }
            }
        };

        threadA.start();
        threadB.start();

        // 작업 스레드들이 모두 종료될 때까지 메인 스레드를 기다리게 함
        try{
            threadA.join();
            threadB.join();
        }catch(Exception e){
        }

        int size = map.size();
        System.out.println("총 객체 수: " + size);
        System.out.println();


    }

}
