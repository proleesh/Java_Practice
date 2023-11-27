package com.proleesh.ex25.sec11;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ReduceTest {
    public static void main(String[] args) {
        String name = Stream.of("s", "e","a","n")
                .reduce("", (s, c) -> s + c);
        System.out.println(name);

        Integer product = Stream.of(2, 3, 4)
                .reduce(1, (a, b) -> a * b);
        System.out.println(product); // 1 * 2 * 3 * 4 = 24

        BinaryOperator<Integer> op = Integer::sum;
        Stream<Integer> empty = Stream.empty();
        Stream<Integer> oneElement = Stream.of(6);
        Stream<Integer> multipleElements = Stream.of(3, 4, 5);
        empty.reduce(op).ifPresent(System.out::println);
        oneElement.reduce(op).ifPresent(System.out::println);
        multipleElements.reduce(op).ifPresent(System.out::println);

        Integer val = Stream.of(1, 1, 1).reduce(1, (a, b) -> a);
        System.out.println(val);

        Stream<String> stream = Stream.of("car", "bus", "train", "aeroplane");
        int length = stream.reduce(0,
                (n, str) -> n + str.length(),
                Integer::sum);

        System.out.println(length);

        StringBuilder word = Stream.of("ad", "jud", "i", "cate")
                .collect(StringBuilder::new,
                        StringBuilder::append,
                        StringBuilder::append);
        System.out.println(word);
    }
}
