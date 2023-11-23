package com.proleesh.ex25.sec11;

import java.util.stream.Stream;

class Dog{}
public class BuildStreams {
    public static void main(String[] args) {
        Stream<Integer> streamI = Stream.of(1,2,3);
        System.out.println(streamI.count());

        Stream<String> streamS = Stream.of("a", "b", "c", "d");
        System.out.println(streamS.count());

        Stream<Dog> streamD = Stream.of(new Dog());
        System.out.println(streamD.count());
    }
}
