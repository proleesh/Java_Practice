package com.proleesh.ex31;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("/Users/sunghyuklee/Downloads/test/TestClass.java");

            int data;
//            int readByteNo;
//            byte[] readBytes = new byte[20];
//            while((readByteNo = fis.read(readBytes)) != -1){
//                System.out.println(readByteNo);
//            }

            while((data = fis.read()) != -1){
                System.out.write(data);
            }

            fis.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
