package com.proleesh.ex34.strongreferece;

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

public class StrongReferenceTest {
    public static void main(String[] args) throws Exception {
        Person[] people = new Person[1000000000];
        for(var i = 0; i < people.length; ++i){
            people[i] = new Person(
                    "이름: " + i, (i + 1) * 4 % 100
            );
        }
        System.out.println(people[2]);
        System.out.println(people[4]);
        System.gc();
        System.out.println(people[4]);
        System.out.println(people[2]);
    }
}
