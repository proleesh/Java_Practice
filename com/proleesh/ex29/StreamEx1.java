package com.proleesh.ex29;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int max = 0;
        for(Integer integer : list){
            if(integer % 2  == 0){
                max = integer>=max ? integer : max;
            }
        }
        System.out.println("짝수: " + max);

        // StreamAPI 이용
        list.stream()
                .filter(i -> i % 2 == 0)
                .max(Integer::compareTo)
                        .ifPresent(System.out::println);

        Stream<Integer> integerStream = Stream.of(1, 2, 3);
        Stream<Integer> concat = Stream.concat(Stream.of(2, 3, 4), integerStream);
        Stream<Object> build = Stream.builder().add("12").add("13").build();

        List<Integer> listStream = List.of(1, 2, 3);
        listStream.parallelStream()
                .filter(i -> {
                    synchronized (StreamEx1.class) {
                        System.out.println("filter thread name: " + Thread.currentThread().getName());
                        System.out.println("filtering: " + i);
                        return i > 0;
                    }
                }).count();
        Set<Integer> setStream = Set.of(1, 2, 3);
        setStream.stream();
        Map<String, Integer> mapStream = Map.of("id1",12, "id2", 13, "id3", 14);
        mapStream.keySet().stream();
        mapStream.values().stream();

    }


}
