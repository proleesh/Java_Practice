package com.proleesh.ex25.sec14;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx03 {
    public static void main(String[] args) {
        int[] smart = {11, 33, 66, 77, 99};

        // (1) int[] -> Stream
        IntStream stream = Arrays.stream(smart);

        // (2) IntStream -> Stream<Integer>
        Stream<Integer> boxed = stream.boxed();

        // (3) Stream<Integer> -> Integer[]
        Integer[] result = boxed.toArray(Integer[]::new);

        for (Integer integer:
             smart) {
            System.out.print(integer + " ");
        }
        System.out.println();

        System.out.println(result.getClass().getTypeName());

        Integer[] stream2 = Arrays.stream(smart)
                .boxed()
                .toArray(Integer[]::new);

        for(Integer i : stream2){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println(stream2.getClass().getTypeName());

    }
}
