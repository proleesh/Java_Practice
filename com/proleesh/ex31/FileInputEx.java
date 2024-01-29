package com.proleesh.ex31;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputEx {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("/Users/sunghyuklee/Downloads/test/test.txt");

        int readByte;
        int i = 0;
        long start = 0, end = 0;

        start = System.currentTimeMillis();
        while((readByte=is.read()) != -1){
            System.out.println("현재: " + ++i + " byte");
        }
        end = System.currentTimeMillis();

        System.out.println("사용시간(밀리초): " + (end - start) + "ms");

        is.close();

    }
}
