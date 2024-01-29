package com.proleesh.ex31;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FIleExample {
    public static void main(String[] args) throws Exception{
        File dir = new File("/Users/sunghyuklee/Downloads/test/test");
        File file1 = new File("/Users/sunghyuklee/Downloads/test/test2.txt");
        File file2 = new File("/Users/sunghyuklee/Downloads/test/test3.txt");
        File file3 = new File("/Users/sunghyuklee/Downloads/test/test4.txt");

        if(!dir.exists()) dir.mkdirs();
        if(!file1.exists()) file1.createNewFile();
        if(!file2.exists()) file2.createNewFile();
        if(!file3.exists()) file3.createNewFile();

        File temp = new File("/Users/sunghyuklee/Downloads/test");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  a  HH:mm");
        File[] contents = temp.listFiles();
        for(File file : contents){
            System.out.print(sdf.format(new Date(file.lastModified())));
            if(file.isDirectory()){
                System.out.print("\t<dir>\t\t\t\t" + file.getName());
            }else{
                System.out.print("\t\t\t" + file.length() + " byte \t" + file.getName());
            }
            System.out.println();
        }

    }
}
