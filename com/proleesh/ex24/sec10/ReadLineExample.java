package com.proleesh.ex24.sec10;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadLineExample {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("com/proleesh/ex24/sec10/ReadLineExample.java"));

        long start = System.nanoTime();
        int lineNo = 1; // 1번 라인 부터
        while(true){
            String str = br.readLine();
            if(str == null) break;
            System.out.println(lineNo + "\t" + str);
            lineNo++;
        }
        br.close();
        long end = System.nanoTime();
        System.out.println("소유 시간: " + (end-start) + " ns");
    }
}
