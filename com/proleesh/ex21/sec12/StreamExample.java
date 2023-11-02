package com.proleesh.ex21.sec12;

import java.util.stream.IntStream;

public class StreamExample {
    public static int sum;

    public static void main(String[] args) {
        IntStream stream = IntStream.rangeClosed(1, 100);
        stream.forEach(i -> sum+=i);
        System.out.println("총합: " + sum);
    }
}
