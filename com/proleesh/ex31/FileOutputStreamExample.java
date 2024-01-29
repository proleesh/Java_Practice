package com.proleesh.ex31;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) throws IOException {
        String originalFileName = "/Users/sunghyuklee/Downloads/test/TestClass.java";
        String targetFileName = "/Users/sunghyuklee/Downloads/test/TestClassCopy.java";

        FileInputStream fis = new FileInputStream(originalFileName);
        FileOutputStream fos = new FileOutputStream(targetFileName);

        int readByteNo;
        byte[] readBytes = new byte[100];

        while((readByteNo = fis.read(readBytes)) != -1){
            fos.write(readBytes, 0, readByteNo);
        }

        fos.flush();
        fos.close();
        fis.close();

        System.out.println("Duplicate Successful!!");
    }
}
