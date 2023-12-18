package com.proleesh.ex26.sec02;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Dog implements Comparable<Dog>{
    private String name;
    private Integer age;

    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
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
    public int compareTo(Dog o) {
        return age.compareTo(o.age);
    }
}
public class SortingDogs {
    public static void main(String[] args) {
        comparable(new Dog[]{new Dog("Jack", 2),
        new Dog("Tom", 1)});
        comparable(Arrays.asList(new Dog("Jack", 2),
                new Dog("Tom", 1)));
        comparable(Arrays.asList(new Dog("Jack", 2),
                new Dog("Tom", 1)));
    }
    public static void comparable(Dog[] dogArray){
        Arrays.sort(dogArray);
        System.out.println(Arrays.toString(dogArray));
    }
    public static void comparable(List<Dog> dogList){
        Collections.sort(dogList);
        System.out.println(dogList);
    }

    public static void comparator(Dog[] dogArray){
        Comparator<Dog> byAge = Comparator.comparing(Dog::getAge);
        Arrays.sort(dogArray, byAge);
        System.out.println(Arrays.toString(dogArray));

        Comparator<Dog> byAgeReversed = Comparator.comparing(Dog::getAge).reversed();
        Arrays.sort(dogArray, byAgeReversed);
        System.out.println(Arrays.toString(dogArray));
    }
}
