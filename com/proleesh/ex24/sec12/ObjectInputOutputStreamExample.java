package com.proleesh.ex24.sec12;

import java.io.*;
import java.util.Arrays;

public class ObjectInputOutputStreamExample {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("/Users/sunghyuklee/test2.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Member m1 = new Member("fall", "단풍이");
        Product p1 = new Product("노트북", 1500000);
        int[] arr1 = {1, 2, 3};

        oos.writeObject(m1);
        oos.writeObject(p1);
        oos.writeObject(arr1);

        oos.flush();
        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("/Users/sunghyuklee/test2.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Member m2 = (Member)ois.readObject();
        Product p2 = (Product)ois.readObject();
        int[] arr2 = (int[])ois.readObject();

        ois.close();
        fis.close();

        System.out.println(m2);
        System.out.println(p2);
        System.out.println(Arrays.toString(arr2));
    }
}
