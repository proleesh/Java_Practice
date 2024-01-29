package com.proleesh.ex31;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;

        byte[] datas = new byte[100];

        System.out.print("name: ");
        int nameBytes = is.read(datas);
        String name = new String(datas, 0, nameBytes - 1);

        System.out.println("Your input name: " + name);
    }
}
