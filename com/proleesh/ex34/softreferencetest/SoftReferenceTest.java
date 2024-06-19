package com.proleesh.ex34.softreferencetest;

import java.lang.ref.SoftReference;

class Person{
    String name;
    int age;

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
public class SoftReferenceTest {
    public static void main(String[] args) throws Exception{
        @SuppressWarnings("unchecked")
        SoftReference<Person>[] people = new SoftReference[100000];
        for(var i = 0; i < people.length; ++i){
            people[i] = new SoftReference<>(new Person(
                    "이름" + i, (i + 1) * 4 % 100
            ));
        }
        System.out.println(people[1].get());
        System.out.println(people[4].get());
        System.gc();

        System.out.println(people[1].get());
        System.out.println(people[4].get());
    }
}
