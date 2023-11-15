package com.proleesh.ex24.sec13;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesExample {
    public static void main(String[] args) {
        try{
            String data = "" +
                    "id: java\n" +
                    "email: java@java.com\n" +
                    "tel: +82 10-1234-5678";
            Path path = Paths.get("/Users/sunghyuklee/test3.txt");

            Files.writeString(Paths.get("/Users/sunghyuklee/test3.txt"),
                    data, Charset.forName(("UTF-8")));

            System.out.println("파일 유형: " + Files.probeContentType(path));
            System.out.println("파일 크기: " + Files.size(path) + " bytes");

            String content = Files.readString(path, Charset.forName(("UTF-8")));
            System.out.println(content);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
