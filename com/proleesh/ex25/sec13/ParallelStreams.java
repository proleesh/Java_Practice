package com.proleesh.ex25.sec13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreams {
    public static void main(String[] args) {
        // Collection<E>
        Stream<String> animalsStream = List.of("sheep", "pigs", "horses").parallelStream();
        // Stream<T>
        Stream<String> animalsStream2 = Stream.of("sheep", "pigs", "horses").parallel();

        System.out.println(animalsStream.count());
        System.out.println(animalsStream2.count());

        int sum = Stream.of(10, 20, 30, 40, 50, 60)
                .parallel()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum == " + sum);

        sequentialStream();
        System.out.println();
        parallelStream();
    }
    public static void sequentialStream(){
        Arrays.asList("a", "b", "c")
                .stream()
                .forEach(System.out::print);
    }

    public static void parallelStream(){
        Arrays.asList("a", "b", "c","d","e")
                .stream()
                .parallel()
                .forEach(System.out::print);
    }
}
