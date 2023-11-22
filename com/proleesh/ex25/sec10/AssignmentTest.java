package com.proleesh.ex25.sec10;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

interface Evaluate<T>{
    boolean isNegative(T t);
}
public class AssignmentTest {
    public static void main(String[] args) {
        Supplier<Integer> sInt = () -> 77;

        System.out.println(sInt.get());

        Consumer<String> a = System.out::println;
        a.accept("Hello World");

        Evaluate<Integer> lambda = i -> i < 0;
        System.out.println("Evaluate: " + lambda.isNegative(-1));

        int value = -1;
        System.out.println(check(value,i -> i < 0));



    }
    public static <T> boolean check(T t, Predicate<T> lambda){
        return lambda.test(t);
    }
}