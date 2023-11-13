package com.proleesh.ex24.sec01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        try{
            OutputStream os = new FileOutputStream("/Users/sunghyuklee/WriteEx.txt");

            byte[] array = {10, 20, 30, 40, 50};

            os.write(array, 1, 4);

            os.flush();
            os.close();

            System.out.println("저장 성공");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
