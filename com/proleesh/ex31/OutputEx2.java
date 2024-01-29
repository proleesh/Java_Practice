package com.proleesh.ex31;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputEx2 {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("/Users/sunghyuklee/Downloads/test/test3.txt");
        byte[] data = "Hello World! from OutputEx2".getBytes();
        os.write(data);

        System.out.println("Write finished!!");

        os.flush();
        os.close();
    }
}
