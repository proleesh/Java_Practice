package com.proleesh.ex25.sec13;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PrimitiveStreamTest3 {
    public static void main(String[] args) {
        mappingPrimitiveStreams();
        mappingObjectStreams();
        ranges();
        usingSum();
    }

    private static void mappingPrimitiveStreams() {
        Stream<String> streamAges = IntStream.of(1,2,3)
                .mapToObj(n -> "Numbers: " + n);
        streamAges.forEach(System.out::println);

        // IntStream to DoubleStream
        DoubleStream dblStream = IntStream.of(1,2,3)
                .mapToDouble(n -> (double)n);
        dblStream.forEach(System.out::println);

        IntStream.of(1, 2, 3)
                .map(n -> n*2)
                .forEach(System.out::println);
        IntStream.of(1, 2, 3)
                .mapToLong(n -> (long)n)
                .forEach(System.out::println);

    }

    public static void mappingObjectStreams(){
        Stream.of("ash", "beech", "sycamore")
                .map(String::toUpperCase)
                .forEach(System.out::println);

        DoubleStream dblStream = Stream.of("ash", "beech", "sycamore")
                .mapToDouble(String::length);
        dblStream.forEach(System.out::println);

        IntStream intStream = Stream.of("ash","beech","sycamore")
                .mapToInt(String::length);
        intStream.forEach(System.out::println);

        LongStream longStream = Stream.of("ash", "beech", "sycamore")
                .mapToLong(String::length);
        longStream.forEach(System.out::println);
    }

    public static void ranges(){
        IntStream.range(1, 5)
                .forEach(System.out::println); // 1234
        IntStream.rangeClosed(1, 5)
                .forEach(System.out::println); // 12345
    }

    public static void usingSum(){
        Stream<Integer> numbers = Stream.of(1, 2, 3);

        System.out.println(numbers.reduce(0, Integer::sum));

        IntStream intS = Stream.of(1,2,3)
                .mapToInt(n -> n);
        int total = intS.sum();
        System.out.println(total);
    }
}
