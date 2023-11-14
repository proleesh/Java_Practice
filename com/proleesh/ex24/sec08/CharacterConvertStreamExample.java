package com.proleesh.ex24.sec08;

import java.io.*;

public class CharacterConvertStreamExample {
    public static void main(String[] args) {
        try {

            String str = "문자 변환 스트림을 사용합니다.";
            write(str);
            System.out.println(read());


//            byte[] data = new byte[100];
//            int num = is.read(data);
//            String str2 = new String(data, "UTF-8");
//            System.out.println(str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void write(String str) throws IOException{
        OutputStream os = new FileOutputStream("/Users/sunghyuklee/WriteEx.txt");
        Writer writer = new OutputStreamWriter(os, "UTF-8");
//            byte[] data = str.getBytes("UTF-8");

        writer.write(str);

        writer.flush();
        writer.close();
    }

    public static String read() throws IOException{
        InputStream is = new FileInputStream("/Users/sunghyuklee/WriteEx.txt");
        Reader reader = new InputStreamReader(is, "UTF-8");
        BufferedReader br = new BufferedReader(reader);
//        char[] data = new char[20];
//        int num = reader.read(data);
//        String str = new String(data, 0, num);
        String str = br.readLine();
        return str;
    }
}
