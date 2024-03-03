package com.proleesh.ex33;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPITest {
    public static void main(String[] args) {
        Integer[] integerArray = new Integer[]{1,2,3,4,5,6,7,8,9,10,9,5};

        List<Integer> list = Arrays.asList(integerArray);


//        list.stream()
//                .filter(v -> v % 2 == 0)
//                .collect(Collectors.toList())
//                .forEach(v -> System.out.print(v + " "));

        list.stream().distinct().forEach(v -> System.out.print(v + " "));
    }
}
