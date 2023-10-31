package com.proleesh.ex21.sec04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        // Set 컬렉션 생성
        Set<String> set = new HashSet<>();
        set.add("홍길동");
        set.add("이순신");
        set.add("이명박");

        // 내부 반복자
        // Stream을 이용한 요소 반복 처리
        Stream<String> stream = set.stream();
        stream.forEach(name -> System.out.println(name));
        /**
         * Stream은 Iterator와 비슷한 반복자이지만, 다음과 같은 차이점을 가지고 있다.
         * 1. 내부 반복자이므로 처리 속도가 빠르고 병렬 처리에 효율적이다.
         * 2. 람다식으로 다양한 요소 처리를 정리할 수 있다.
         * 3. 중간 처리와 최종 처리를 수행하도록 파이프 라인을 형성할 수 있다.
         */

        System.out.println();

        // 외부 반복자 이용
        // for
        for(String item : set){
            System.out.println(item);
        }
        System.out.println();

        // Iterator
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String item = iterator.next();
            System.out.println(item);
        }
    }
}
