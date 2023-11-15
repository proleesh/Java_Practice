package com.proleesh.ex24.sec13;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
    public static void main(String[] args) throws Exception{
        File dir = new File("/Users/sunghyuklee");
        File file1 = new File("/Users/sunghyuklee/test.txt");
        File file2 = new File("/Users/sunghyuklee/test2.txt");
        File file3 = new File("/Users/sunghyuklee/WriteEx.txt");

        if(dir.exists() == false){
            dir.mkdirs();
        }
        if(file1.exists() == false){
            file1.createNewFile();
        }
        if(file2.exists() == false){
            file2.createNewFile();
        }
        if(file3.exists() == false){
            file3.createNewFile();
        }

        File temp = new File("/Users/sunghyuklee");
        File[] contents = temp.listFiles();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
        for(File file : contents){
            System.out.printf("%s", sdf.format(new Date(file.lastModified())));
            if(file.isDirectory()){
                System.out.printf("%s%s", "<DIR>", file.getName());
            }else{
                System.out.printf("%s%s", file.length(), file.getName());
            }
            System.out.println();
        }
    }
}
