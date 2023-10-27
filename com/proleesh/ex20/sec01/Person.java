package com.proleesh.ex20.sec01;

public class Person implements Comparable<Person>{
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return (this.age < o.age)?-1:((this.age == o.age)?0:1);
    }
}
