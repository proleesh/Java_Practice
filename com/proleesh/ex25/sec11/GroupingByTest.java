package com.proleesh.ex25.sec11;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingByTest {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("Joe", "Tom", "Tom", "Alan", "Peter");
        Map<Integer, List<String>> map = names.collect(
                Collectors.groupingBy(String::length)
        );
        System.out.println(map);

        Stream<String> names2 = Stream.of("Joe", "Tom", "Tom", "Alan", "Peter");
        Map<Integer, Set<String>> map2 = names2.collect(
                Collectors.groupingBy(
                        String::length,
                        Collectors.toSet()
                )
        );
        System.out.println(map2);

        Stream<String> names3 = Stream.of("Joe", "Tom", "Tom", "Alan", "Peter");
        TreeMap<Integer, List<String>> map3 =
                names3.collect(
                        Collectors.groupingBy(
                                String::length,
                                TreeMap::new,
                                Collectors.toList()
                        )
                );
        System.out.println(map3);
        System.out.println(map3.getClass());

        Stream<String> names4 = Stream.of("Thomas", "Teresa", "Mike", "Alan", "Peter");
        Map<Boolean, List<String>> map4 = names4.collect(
                Collectors.partitioningBy(s -> s.startsWith("T"))
        );
        System.out.println(map4);

        Stream<String> names5 = Stream.of("Thomas", "Teresa", "Mike", "Alan", "Peter");
        Map<Boolean, List<String>> map5 = names5.collect(Collectors.partitioningBy(s -> s.length() > 4));
        System.out.println(map5);

        Stream<String> names6 = Stream.of("Thomas", "Teresa", "Mike", "Alan", "Peter", "Sebastian");
        Map<Boolean, List<String>> map6 = names6.collect(Collectors.partitioningBy(s -> s.length() > 10));
        System.out.println(map6);

        Stream<String> names7 = Stream.of("Alan", "Teresa", "Mike", "Alan", "Peter");
        Map<Boolean, Set<String>> map7 =
                names7.collect(
                        Collectors.partitioningBy(
                                s->s.length() > 4,
                                Collectors.toSet()
                        )
                );
        System.out.println(map7);
    }
}
