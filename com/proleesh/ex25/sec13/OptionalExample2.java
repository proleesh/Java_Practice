package com.proleesh.ex25.sec13;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

import static com.proleesh.ex25.sec13.OptionalExample.calcAverage;

public class OptionalExample2 {
    public static void main(String[] args) {
        Optional<Double> optAvg = calcAverage(50,60,70);

        if(optAvg.isPresent()){
            System.out.println(optAvg.get());
        }

        optAvg.ifPresent((System.out::println));

        System.out.println(optAvg.orElse(Double.NaN));

        Optional<Double> optAvg2 = calcAverage();
        System.out.println(optAvg2.orElse(Double.NaN));

        System.out.println(optAvg2.orElseGet(()->Math.random()));

        doOptionalNull();
        doOptionalPrimitiveAverage();
    }

    public static void doOptionalNull(){
        Optional<String> optSK = howToDealWithNull("SK");
        optSK.ifPresent(System.out::println);
        Optional<String> optNull = howToDealWithNull(null);
        System.out.println(
                optNull.orElseGet(
                        ()->"Empty optional"
                )
        );
    }
    public static Optional<String> howToDealWithNull(String param){
        Optional optReturn = Optional.ofNullable(param);
        return optReturn;
    }

    public static void doOptionalPrimitiveAverage(){
        OptionalDouble optAvg = IntStream.rangeClosed(1, 10)
                .average();
        optAvg.ifPresent(System.out::println);
        System.out.println(optAvg.getAsDouble());

        System.out.println(optAvg.orElseGet(()->Double.NaN));
    }
}
