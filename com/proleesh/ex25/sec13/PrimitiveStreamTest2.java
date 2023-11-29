package com.proleesh.ex25.sec13;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PrimitiveStreamTest2 {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(1,2,3);
        System.out.println(numbers.reduce(0, Integer::sum));


        IntStream intStream = Stream.of(1,2,3)
                .mapToInt(n -> n);
        int total = intStream.sum();
        System.out.println(total);

        OptionalInt max = IntStream.of(10,20,30).max();
        max.ifPresent(System.out::println);

        OptionalDouble min = DoubleStream.of(10.0,20.0,30.0).min();

        System.out.println(min.orElseThrow());

        OptionalDouble average = LongStream.of(10L, 20L, 30L).average();
        System.out.println(average.orElseGet(Math::random));
        stats(IntStream.of(5,10,15,20));
        stats(IntStream.empty());
    }

    private static void stats(IntStream intStream) {
        IntSummaryStatistics intStats = intStream.summaryStatistics();
        int min = intStats.getMin();
        System.out.println(min);
        int max = intStats.getMax();
        System.out.println(max);
        double avg = intStats.getAverage();
        System.out.println(avg);
        long count = intStats.getCount();
        System.out.println(count);
        long sum = intStats.getSum();
        System.out.println(sum);
    }
}
