package com.proleesh.ex25.sec14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class StreamTest02 {
    public static void main(String[] args) {
        int[] A = {32, 44, 22, 33, 32, 44, 22, 48};
        List<Integer> stream = Arrays.stream(A)
                .boxed()
                .distinct()
//                .sorted(Comparator.reverseOrder())
                .sorted(Comparator.naturalOrder())
                .toList();

        System.out.println(stream);
    }
}
