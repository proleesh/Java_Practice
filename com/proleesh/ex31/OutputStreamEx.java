package com.proleesh.ex31;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx {
    public static void main(String[] args) throws IOException {
        OutputStream os = System.out;

        for(byte b=48; b < 58; b++){
            os.write(b);
        }
        os.write(10); // line feed

        for(byte b = 97; b < 123; b++){
            os.write(b);
        }
        os.write(10);

        os.flush();
        os.close();
    }
}
