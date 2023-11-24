package com.proleesh.ex25.sec11;

import java.util.Optional;
import java.util.stream.Stream;

public class TerminalOperations {
    public static void main(String[] args) {

//        System.out.println(Stream.of("dog", "cat", "pig").count());

        // because of .count() method return type is long, so I'm use long type.
        long count = Stream.of("dog", "cat", "pig").count();
        System.out.println(count);

        // Optional<T>
        Optional<String> max = Stream.of("deer", "cat", "horse").max((s1, s2)->s1.length() - s2.length());
        max.ifPresent(System.out::println);

        // Optional<T>
        Optional<Integer> min = Stream.of(200,4,6, 8, 1).min((i1,i2) -> i1 - i2);
        min.ifPresent(System.out::println);

        // Optional<T>
        Optional<String> any = Stream.of("John", "Kally", "Sebastian").findAny();
        any.ifPresent(System.out::println);

        // Optional<T>
        Optional<String> first = Stream.of("KT", "SKT", "LGU+").findFirst();
        first.ifPresent(System.out::println);



    }
}
