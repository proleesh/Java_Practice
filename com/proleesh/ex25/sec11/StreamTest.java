package com.proleesh.ex25.sec11;

import java.util.Arrays;
import java.util.List;
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


    }
}
