package com.proleesh.ex31;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderEx {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("/Users/sunghyuklee/Downloads/test/test.txt");
        int readData;
        while((readData = reader.read()) != -1){
            char charData = (char) readData;
            System.out.print(charData);
        }

        reader.close();
    }
}
