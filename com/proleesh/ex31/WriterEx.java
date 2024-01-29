package com.proleesh.ex31;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterEx {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("/Users/sunghyuklee/Downloads/test/test5.txt");
        char[] data = "Hello World!! from WriterEx".toCharArray();
        for(int i = 0; i < data.length; ++i){
            writer.write(data[i]);
        }
//        writer.write(data);
        System.out.println("Writer Finished");
        writer.close();
    }
}
