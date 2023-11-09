package com.proleesh.ex23.sec06;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

/**
 * 병렬 처리 성능
 * 스트림 병렬 처리가 스트림 순차 처리보다 항상 실행 성능이 좋다고 판단해서는 안된다. 그 전에 먼저
 * 병렬 처리에 영향을 미치는 다음 3가지 요인을 잘 살펴보아야 한다.
 * 1. 요소의 수와 요소당 처리 시간
 * 컬렉션에 전체 요소와 수가 적고 요소당 처리 시간이 짧으면 일반 스트림이 병렬 스트림보다 빠를 수 있다.
 * 병렬 처리는 포크 및 조인 단계가 있고, 스레드 풀을 생성하는 추가적인 비용이 발생하기 때문이다.
 * 2. 스트림 소스의 종류
 * ArrayList와 배열은 인덱스로 요소를 관리하기 때문에 포크 단계에서 요소를 쉽게 분리할 수 있어 병렬
 * 처리 시간이 절약된다. 반면에 HashSet, TreeSet은 요소 분리가 쉽지 않고, LinkedList 역시 링크를
 * 따라가야 하므로 요소 분리가 쉽지 않다. 따라서 이 소스들은 상대적으로 병렬 처리가 늦다.
 * 3. 코어의 수
 * CPU 코어의 수가 많으면 많을수록  병렬 스트림의 성능은 좋아진다. 하지만 코어의 수가 적을 경우에는 일반
 * 스트림이 더 빠를 수 있다 병렬 스트림은 스레드 수가 증가하여 동시성이 많이 일어나므로 오히려 느려진다.
 */
public class ParallelExample {
    public static void main(String[] args) {
        Random random = new Random();

        List<Integer> scores = new ArrayList<>();
        for(int i=0; i < 100000000; ++i){
            scores.add(random.nextInt(101));
        }

        double avg = 0.0;
        long startTime = 0;
        long endTime = 0;
        long time = 0;

        Stream<Integer> stream = scores.stream();
        startTime = System.nanoTime();
        avg = stream
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();
        endTime = System.nanoTime();
        time = endTime - startTime;
        System.out.println("avg: " + avg + "" +
                ", 일반 스트림 처리 시간: " + time +"ns");

        Stream<Integer> parallelStream = scores.parallelStream();
        startTime = System.nanoTime();
        avg = parallelStream
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();
        endTime = System.nanoTime();
        time = endTime - startTime;
        System.out.println("avg: " + avg + ", 병렬 스트림 처리 시간: " + time);
    }
}
