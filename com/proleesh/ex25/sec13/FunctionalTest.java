package com.proleesh.ex25.sec13;

import java.util.function.*;

public class FunctionalTest {
    public static void main(String[] args) {
        System.out.println("[1] Anonymous Class");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Supplier<Integer> as = new Supplier<>(){
            @Override
            public Integer get() {
                return (int)(Math.random() * 10 + 1);
            }
        };
        System.out.println(as.get());

        System.out.println("[2] Consumer Interface");
        Consumer<Integer> c1 = System.out::println;
        c1.accept(314);

        System.out.println("[3] Supplier Interface");
        Supplier<Integer> s1 = () -> (int)(Math.random()*10);
        System.out.println(s1.get());

        System.out.println("[4] Functional Interface");
        Function<Integer, Double> f = i -> i / 2.0;
        System.out.println(f.apply(12));

        System.out.println("[5] Predicate Interface");
        Predicate<Integer> p1 = i -> i == 10;
        System.out.println(p1.test(33));
        Predicate<Integer> p2 = i -> i < 10;
        Predicate<Integer> p3 = i -> i < 20;
        Predicate<Integer> p4 = p1.or(p2.negate().and(p3));
        System.out.println(p4.test(19));
        Predicate<String> p5 = Predicate.isEqual("SmartIT");
        System.out.println(p5.test("SmartIT"));

        System.out.println("[6] UnaryOperator Interface");
        UnaryOperator<Integer> u = i -> i * 10;
        System.out.println(u.apply(2));

        System.out.println("[7] BiFunction Interface");
        BiFunction<Integer, Integer, Double> bf = (i1, i2) -> i1 / (double)i2;
        System.out.println(bf.apply(36,18));


    }
}
