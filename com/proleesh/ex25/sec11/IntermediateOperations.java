package com.proleesh.ex25.sec11;

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
    }
}
