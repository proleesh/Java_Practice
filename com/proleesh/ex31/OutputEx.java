package com.proleesh.ex31;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputEx {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("/Users/sunghyuklee/Downloads/test/test2.txt");

        byte[] data = "Hello World! from OutputEx".getBytes();
        for(int i = 0; i < data.length; ++i){
            os.write(data[i]);
        }
        System.out.println("Write finished!!");

        os.flush();
        os.close();
    }
}
