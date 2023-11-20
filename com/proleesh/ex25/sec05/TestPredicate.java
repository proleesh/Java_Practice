package com.proleesh.ex25.sec05;

import java.util.function.Predicate;

interface  Evaluate<T>{
    boolean isNegative(T t);
}

public class TestPredicate {
    public static void main(String[] args) {

        Evaluate<Integer> lambda = i -> i < 0;
        System.out.println("Evaluate: " + lambda.isNegative(-1));
        System.out.println("Evaluate: " + lambda.isNegative(1));

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Predicate<Integer> predicate = i -> i < 0;
        System.out.println("Predicate: " + predicate.test(-1));
        System.out.println("Predicate: " + predicate.test(1));


        int x = 4;
        System.out.println(x + "은(는) 짝수 입니까? " + check(x, n -> n % 2 == 0));
        x = 3;
        System.out.println(x + "은(는) 홀수 입니까? " + check(x, n -> n % 2 != 0));

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        String name = "Mr.Lawrence";
        System.out.println("Does " + name + " start with Mr. ? " + check(name, s -> s.startsWith("Mr.")));
        name = "Dr.Lee";
        System.out.println("Does " + name + " start with Dr. ? " + check(name, s -> s.startsWith("Dr.")));
        name = "Ms.Jessica";
        System.out.println("Does " + name + " start with Dr. ? " + check(name, s -> s.startsWith("Dr.")));
    }

    public static <T> boolean check(T t, Predicate<T> lambda){
        return lambda.test(t);
    }
}
