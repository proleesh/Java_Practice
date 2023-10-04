package com.proleesh.ex07;

public class TringleTest {
    public static void main(String[] args) {
        Tringle t = new Tringle(10.0, 5.0);
        System.out.println(t.findArea());

        Tringle t1 = new Tringle(10.0, 5.0);
        Tringle t2 = new Tringle(5.0, 10.0);
        Tringle t3 = new Tringle(8.0, 8.0);

        System.out.println(t1.isSameArea(t2));
        System.out.println(t1.isSameArea(t3));
    }
}
