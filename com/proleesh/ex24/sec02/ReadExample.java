package com.proleesh.ex24.sec02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) {
        try{
            InputStream is = new FileInputStream("/Users/sunghyuklee/WriteEx.txt");
            while(true){
                int data = is.read();
                if(data == -1) break;
                System.out.println(data);
            }
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
