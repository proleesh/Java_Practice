package com.proleesh.ex29;

import java.util.List;


public class StreamEx2 {
    static class Person{
        private String name;
        private String gender;
        private Integer age;

        public Person() {
        }

        public Person(String name, String gender, Integer age) {
            this.name = name;
            this.gender = gender;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender='" + gender + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
    public static void main(String[] args) {
        List<Person> list = List.of(
                new Person("Kim", "male", 22),
                new Person("Choi", "female", 24),
                new Person("Wang", "male", 24),
                new Person("Lee", "female", 25)
        );

        list.stream()
                .filter(p -> p.age  > 23)
                .map(p -> p.name)
                .forEach(s -> System.out.println(s.toString()));
    }
}
