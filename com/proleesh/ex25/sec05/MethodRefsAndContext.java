package com.proleesh.ex25.sec05;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodRefsAndContext {
    public static void main(String[] args) {
        Supplier<Integer> lambda1 = () -> Person.howMany();
        Supplier<Integer> lambdaMR = Person::howMany;

        System.out.println(lambda1.get());
        System.out.println(lambdaMR.get());

        Function<Person, Integer> lambda2 = (person) -> Person.howMany(person);
        Function<Person, Integer> lambdaMR2 = Person::howMany;

        System.out.println(lambda2.apply(new Person()));
        System.out.println(lambdaMR2.apply(new Person()));

        BiFunction<Person, Person, Integer> lambda3 = (person1, person2) -> Person.howMany(person1, person2);
        BiFunction<Person, Person, Integer> lambdaMR3 = Person::howMany;

        System.out.println(lambda3.apply(new Person(), new Person()));
        System.out.println(lambdaMR3.apply(new Person(), new Person()));
    }

}
class Person{
    public static Integer howMany(Person... people){
        return people.length;
    }
}