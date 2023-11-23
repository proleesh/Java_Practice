package com.proleesh.ex25.sec11;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        Double[] numbers = {1.1, 2.2, 3.3};
        Stream<Double> stream1 = Arrays.stream(numbers);

//        long n = stream1.count();
        System.out.println("Number of elements: " + stream1.count());

        List<String> animalList = Arrays.asList("cat", "dog", "sheep");
        Stream<String> streamAnimal = animalList.stream();
        System.out.println("Number of elements: " + streamAnimal.count());

        Map<String, Integer> namesToAges = new HashMap<>();
        namesToAges.put("Mike", 22);
        namesToAges.put("Mary", 24);
        namesToAges.put("Alice", 31);
        System.out.println("Number of entries: " +
                namesToAges
                .entrySet()
                .stream()
                .count());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        Stream<Integer> infStream = Stream.generate(()->{
            return (int) (Math.random() * 45 + 1);
        });
        infStream.limit(6)
                .forEach(s -> System.out.print(s + " "));

        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

        Stream<Integer> infStream2 = Stream.iterate(2, n -> n + 2);

        infStream2.limit(10).forEach(System.out::println);


    }
}
