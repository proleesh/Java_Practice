package com.proleesh.ex23.sec07;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        try{
            OutputStream os = new FileOutputStream("/Users/sunghyuklee/spring.log");

            byte a = 10;
            byte b = 20;
            byte c = 30;

            os.write(a);
            os.write(a);
            os.write(a);

            os.flush();
            os.close();

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
