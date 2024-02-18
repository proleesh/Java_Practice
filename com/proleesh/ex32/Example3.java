package com.proleesh.ex32;

public class Example3 {
    public static void main(String[] args) {
        String sNum = "1234";
        int i1 = Integer.parseInt(sNum);
        int i2 = Integer.valueOf(sNum);

        System.out.println(i1);
        System.out.println(i2);
        System.out.println((i1 == i2) ? "yes!":"no");

        double d1 = Double.parseDouble(sNum);
        double d2 = Double.valueOf(sNum);

        System.out.println(d1);
        System.out.println(d2);

        float f1 = Float.valueOf(sNum);
        float f2 = Float.parseFloat(sNum);

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f1 == d1);

        long l1 = Long.parseLong(sNum);
        long l2 = Long.valueOf(sNum);

        System.out.println(l1);
        System.out.println(l2);

        short s1 = Short.parseShort(sNum);
        short s2 = Short.valueOf(sNum);

        System.out.println(s1);
        System.out.println(s2);




    }
}
