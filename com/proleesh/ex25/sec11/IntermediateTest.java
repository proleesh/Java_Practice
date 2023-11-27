package com.proleesh.ex25.sec11;

import java.util.Comparator;
import java.util.stream.Stream;

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class IntermediateTest {
    public static void main(String[] args) {
        Person john = new Person("John", 23);
        Person mary = new Person("Mary", 25);
        Stream.of(mary, john)
                .sorted(Comparator.comparing(Person::toString))
                .forEach(System.out::println);
    }
}
