package com.proleesh.ex31;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterEx2 {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("/Users/sunghyuklee/Downloads/test/test6.txt");
        char[] data = "Hello World!! from WriterEx2".toCharArray();
        for(int i = 0; i < data.length; ++i){
            writer.write(data[i]);
        }
        writer.close();
    }
}
