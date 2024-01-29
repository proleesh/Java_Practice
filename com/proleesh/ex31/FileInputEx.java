package com.proleesh.ex31;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputEx {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("/Users/sunghyuklee/Downloads/test/test.txt");

        int readByte;
        int i = 0;

        while((readByte=is.read()) != -1){
            System.out.println("현재: " + ++i + " byte");
        }

        is.close();

    }
}
