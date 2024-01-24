package com.proleesh.ex29;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestFunction3 {
    public static void main(String[] args) {
        // 제공: supplier 함수 정의
        Supplier<String> supplier = () -> "48";
        // 예언: 값이 숫자가 맞는지 predicate 로
        Predicate<String> isNumber = str -> str.matches("-?\\d+(\\.\\d)?");
        // convert
        Function<String, Integer> change = Integer::parseInt;
        // print
        Consumer<Integer> consumer = i -> {
            if(i % 2 == 0){
                System.out.println("짝수 : " + i);
            }else{
                System.out.println("홀수 : " + i);
            }
        };

        if(isNumber.test(supplier.get())){
            /**
             * String s = supplier.get();
             * Integer i = change.apply(s);
             * consumer.accept(i);
             */
            // 숫자가 맞음
            consumer.accept(change.apply(supplier.get()));
        }else{
            // 숫자가 아님
            System.out.println("숫자가 아니다.");
        }


    }
}
