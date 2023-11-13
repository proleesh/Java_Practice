package com.proleesh.ex24.sec05;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {
    public static void main(String[] args) {
        try{
            Writer writer = new FileWriter("/Users/sunghyuklee/WriteEx.txt");

            char a = 'A';
            writer.write(a);
            char b = 'B';
            writer.write(b);

            char[] arr = {'C', 'D', 'E'};
            writer.write(arr);

            writer.write("FGH");

            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
