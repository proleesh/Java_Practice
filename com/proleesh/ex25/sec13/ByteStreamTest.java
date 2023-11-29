package com.proleesh.ex25.sec13;

import java.io.*;

public class ByteStreamTest {
    public static void main(String[] args) {
        FileInputStream oldIn = null;
        FileOutputStream oldOut = null;
        try{
            oldIn = new FileInputStream("com/proleesh/ex25/sec13/test01.txt");
            oldOut = new FileOutputStream("com/proleesh/ex25/sec13/test01_out.txt");
            int c;
            while((c = oldIn.read()) != -1){
                oldOut.write(c);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(oldIn != null){
                    oldIn.close();
                }
                if(oldOut != null){
                    oldOut.close();
                }
            }catch(IOException e){
                e.printStackTrace();
            }

        }
        try{
            FileInputStream in = new FileInputStream("com/proleesh/ex25/sec13/test01_out.txt");
            FileOutputStream out = new FileOutputStream("com/proleesh/ex25/sec13/test02_out.txt");
            int c;
            while((c = in.read()) != -1) {
                out.write(c);
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        try(BufferedInputStream in = new BufferedInputStream(new FileInputStream("com/proleesh/ex25/sec13/test02_out.txt"));
            BufferedOutputStream out = new BufferedOutputStream((new FileOutputStream("com/proleesh/ex25/sec13/test03_out.txt")))){
            int c;
            while((c = in.read()) != -1){
                out.write(c);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
