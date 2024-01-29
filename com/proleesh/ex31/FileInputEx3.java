package com.proleesh.ex31;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputEx3 {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("/Users/sunghyuklee/Downloads/test/test.txt");

        byte[] readBytes = new byte[20];

        int i = 0;
        int readByteNo = is.read(readBytes, 2, 11);
        while((readByteNo=is.read(readBytes))!= -1){
            System.out.println("현재: " + ++i + " byte array store");
        }

        is.close();
    }
}
