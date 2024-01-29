package com.proleesh.ex31;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputEx3 {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("/Users/sunghyuklee/Downloads/test/test4.txt");
        byte[] data = "Hello World! from OutputEx3".getBytes();
        os.write(data, 1, 10);

        System.out.println("Write finished!!");

        os.flush();
        os.close();
    }
}
