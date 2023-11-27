package com.proleesh.ex25.sec11;

import com.sun.source.tree.Tree;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorTest {
    public static void main(String[] args) {
        // old version
        /**
         * Stream.of("xxx", "xxx", "xxx").collect(Collectors.joining(", "));
         */
        String s = String.join(", ", "cake", "biscuits", "apple tart");
        System.out.println(s);

        Double avg = Stream.of("cake", "biscuits", "Apple tart")
                .collect(Collectors.averagingInt(String::length));
        System.out.println(avg);

        Map<String, Integer> map =
                Stream.of("cake", "biscuits", "apple tart")
                        .collect(
                                Collectors.toMap(s1 -> s1,
                                        String::length)
                        );
        System.out.println(map);

        Map<Integer, String> map2 = Stream.of("cake", "biscuits", "tart")
                .collect(
                        Collectors.toMap(String::length,
                                s2 -> s2,
                                (s2, s3) -> s2 + "," + s3)
                );
        System.out.println(map2);

        TreeMap<String, Integer> map3 =
                Stream.of("cake", "biscuits", "apple tart", "cake")
                        .collect(
                                Collectors.toMap(s4 -> s4,
                                        String::length,
                                        Integer::sum,
                                        TreeMap::new)
                        );
        System.out.println(map);
        System.out.println(map.getClass());
    }

}
