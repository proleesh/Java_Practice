package com.proleesh.ex26.sec02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Cat implements Comparable<Cat>{

    private String name;
    private Integer age;

    public Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public int compareTo(Cat o) {
        return age.compareTo(o.age);
    }
}

public class SortingCatsMultipleFields {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Trixy", 5));
        cats.add(new Cat("Bella", 7));
        cats.add(new Cat("Bella", 2));
        Comparator<Cat> compCat = Comparator.comparing(Cat::getName)
                .thenComparingInt(Cat::getAge);
        Collections.sort(cats, compCat);
        System.out.println(cats);
    }
}
