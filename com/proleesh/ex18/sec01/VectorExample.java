package com.proleesh.ex18.sec01;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        List<Board> list = new Vector<>();

        Thread threadA = new Thread(){
            @Override
            public void run() {
                for(int i = 1; i <= 100; ++i){
                    list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
                }
            }
        };
        Thread threadB = new Thread(){
            @Override
            public void run() {
                for(int i = 100; i <= 2000; ++i){
                    list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
                }
            }
        };

        threadA.start();
        threadB.start();

        int size = list.size();
        System.out.println("총 객체 수: " + size);
        System.out.println();

    }
}
