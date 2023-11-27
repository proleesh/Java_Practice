package com.proleesh.ex25.sec11;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {
        Stream.of("Korea", "Japan", "India")
                .filter(countryName -> countryName.length() >= 5)
                .forEach(s -> System.out.print(" " + s));

        System.out.println();

        Stream.of("eagle", "eagle", "EAGLE")
                .peek(s -> System.out.print(" 1." + s))
                .distinct()
                .forEach(s -> System.out.print(" 2." + s));

        System.out.println();

        Stream.of(11, 22, 33, 44, 55, 66, 77, 88, 99)
                .peek(n -> System.out.print(" A - " + n))
                .filter(n -> n > 40) // 44 ~
                .peek(n -> System.out.print(" B - " + n))
                .limit(3) // 44 55 66
                .forEach(n -> System.out.print(" C - " + n));
        // 11 22 33 44 55 66

        System.out.println();

        Stream.of("book", "pen", "ruler")
                .map(String::length)
                .forEach(System.out::println);

        List<String> list1 = Arrays.asList("sean", "desmond");
        List<String> list2 = Arrays.asList("mary", "ann");
        Stream<List<String>> streamOfLists = Stream.of(list1, list2);

        streamOfLists.flatMap(Collection::stream)
                .forEach(System.out::println);

        System.out.println("~~~~~~~~~~~~~~~");

        Stream.of("Tim", "Jim", "Peter", "Ann", "Mary")
                .peek(name -> System.out.print(" 0." + name))
                .filter(name -> name.length() == 3)
                .peek(name -> System.out.print(" 1." + name)) // Tim, Jim, Ann
                .sorted()
                .peek(name -> System.out.print(" 2." + name))
                .limit(2) // Ann, Jim
                .forEach(name -> System.out.print(" 3." + name)); // Ann Jim
    }
}
