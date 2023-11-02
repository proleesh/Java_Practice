package com.proleesh.ex21.sec11;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        String[] strArray = {"홍길동", "신용권", "이순신"};
        Stream<String> strStream = Arrays.stream(strArray);
        strStream.forEach(item -> System.out.print(item + ","));
        System.out.println();

        int[] intArray = {1, 3, 5, 7, 9};
        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(item -> System.out.print(item + ","));
        System.out.println();
    }
}
