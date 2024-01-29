package com.proleesh.ex31;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderEx2 {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("/Users/sunghyuklee/Downloads/test/test.txt");
        int readCharNo;
        char[] cbuf = new char[20];
        int i = 0;
        while((readCharNo = reader.read(cbuf)) != -1){
            System.out.println("총 바이트 수: " + readCharNo);
            System.out.println("현재 " + ++i + " byte array store");
        }

        reader.close();
    }
}
