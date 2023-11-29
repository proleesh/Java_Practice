package com.proleesh.ex25.sec13;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveStreamTest {
    public static void main(String[] args) {
        int[] ia = {1,2,3};
        double[] da = {1.1, 2.2, 3.3};
        long[] la = {1L, 2L, 3L};

        IntStream intStream = Arrays.stream(ia);
        DoubleStream doubleStream = Arrays.stream(da);
        LongStream longStream = Arrays.stream(la);

        System.out.println(intStream.count());
        System.out.println(doubleStream.count());
        System.out.println(longStream.count());

        IntStream intStream2 = IntStream.of(1, 2, 3);
        DoubleStream doubleStream2 = DoubleStream.of(1.1,2.2,3.3);
        LongStream longStream2 = LongStream.of(1L, 2L, 3L);

        System.out.println(intStream2.count());
        System.out.println(doubleStream2.count());
        System.out.println(longStream2.count());

    }
}
