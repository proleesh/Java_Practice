package com.proleesh.ex31;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {
    public static void main(String[] args) throws Exception{
        long start;
        long end;

        FileInputStream fis1 = new FileInputStream("/Users/sunghyuklee/Downloads/test/우리 설윤.jpeg");
        start = System.currentTimeMillis();
        while( fis1.read()!= -1){}
        System.out.println();
        end = System.currentTimeMillis();
        System.out.println("Normal FileInput Using time: " + (end - start) + "ms");
        fis1.close();

        FileInputStream fis2 = new FileInputStream("/Users/sunghyuklee/Downloads/test/우리 설윤.jpeg");
        BufferedInputStream bis = new BufferedInputStream(fis2);
        start = System.currentTimeMillis();
        while(bis.read() != -1){}
        end = System.currentTimeMillis();
        System.out.println("Buffered FileInput Using time: " + (end - start) + "ms");
        bis.close();
        fis2.close();

    }
}
