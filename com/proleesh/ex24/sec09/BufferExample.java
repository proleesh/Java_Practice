package com.proleesh.ex24.sec09;

import java.io.*;

public class BufferExample {
    public static void main(String[] args) {
        try {
            String originalFilePath1 = BufferExample.class.getResource("WriteEx.txt").getPath();
            String targetFilePath1 = "/Users/sunghyuklee/WriteEx3.txt";

            FileInputStream fis1 = new FileInputStream(originalFilePath1);
            FileOutputStream fos1 = new FileOutputStream(targetFilePath1);

            String originalFilePath2 = BufferExample.class.getResource("WriteEx.txt").getPath();
            String targetFilePath2 = "/Users/sunghyuklee/WriteEx3.txt";

            FileInputStream fis2 = new FileInputStream(originalFilePath2);
            BufferedInputStream bis = new BufferedInputStream(fis2);
            FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
            BufferedOutputStream bos = new BufferedOutputStream(fos2);

            long nonBufferTime = copy(fis1, fos1);
            System.out.println("버퍼 미사용:\t" + nonBufferTime + " ns");

            long bufferTime = copy(bis, bos);
            System.out.println("버퍼 사용:\t" + bufferTime + " ns");

            fis1.close();
            fos1.close();
            bis.close();
            bos.close();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
    public static long copy(InputStream is, OutputStream os) throws  Exception{
        long start = System.nanoTime();

        while(true){
            int data = is.read();
            if(data == -1) break;
            os.write(data);
        }
        os.flush();

        long end = System.nanoTime();

        return (end - start);
    }
}
