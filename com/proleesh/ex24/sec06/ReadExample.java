package com.proleesh.ex24.sec06;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {
    public static void main(String[] args) {
        try{
            Reader reader = null;

            reader = new FileReader("/Users/sunghyuklee/WriteEx.txt");

            while(true){
                int data = reader.read();
                if(data == -1){
                    break;
                }
                System.out.print((char)data);
            }
            reader.close();
            System.out.println();

            reader = new FileReader("/Users/sunghyuklee/WriteEx.txt");
            char[] data = new char[100];
            while(true){
                int num = reader.read(data);
                if(num == -1) break;
                for(int i=0; i < num; ++i){
                    System.out.print(data[i]);
                }
            }
            reader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
