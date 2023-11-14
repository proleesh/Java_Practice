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
            if(str == null) break; // 해당 라인의 내용이 null 이면 중지
            System.out.println(lineNo + "\t" + str); // 라인 번호 + 해당 라인 내용
            lineNo++; // 줄 읽기 수 하나 씩 증가
        }
        br.close();
        long end = System.nanoTime();
        System.out.println("소유 시간: " + (end-start) + " ns");
    }
}
