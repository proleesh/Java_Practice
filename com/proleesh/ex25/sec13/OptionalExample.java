package com.proleesh.ex25.sec13;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<Double> res = calcAverage(90, 75, 88);
        System.out.println("평균점수: " + res);

        if(res.isPresent()){
            System.out.println(res.get());
        }

        res.ifPresent(System.out::println);

        System.out.println(res.orElse(Double.NaN));

        Optional<Double> res2 = calcAverage();
        System.out.println(res2.orElse(Double.NaN));
        System.out.println(res2.orElseGet(Math::random));

    }
    public static Optional<Double> calcAverage(int... scores){
        if(scores.length == 0){
            return Optional.empty();
        }
        int sum = 0;
        for(int score : scores){
            sum += score;
        }
        return Optional.of((double)sum / scores.length);
    }
}
