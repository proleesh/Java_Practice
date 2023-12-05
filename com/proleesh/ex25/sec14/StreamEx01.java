package com.proleesh.ex25.sec14;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx01 {
    public static void main(String[] args) {
        /**
         *  int (Primitive Data Type) 형태의 array를 가지고
         *  (1) 중복 제거
         *  (2) 내림차순(Descending) 정렬
         *  (3) List Collection Type으로 변환
         *
         */
        int[] arr = {42, 24, 33, 24, 24, 55, 76, 42};
        // Descending을 하기위해 List를 이용한다
        List<Integer> lists = new ArrayList<>();
        // 중복제거를  하기위해 Set를 이용한다
        Set<Integer> sets = new HashSet<>();

        // Stream사용하지 않은 경우
        // add()함수를 이용해 중복을 제거한다.
        for(int i = 0; i < arr.length; ++i){
            sets.add(arr[i]);
        }
        Iterator<Integer> iterator = sets.iterator();
        for(int i = 0; iterator.hasNext(); ++i){
            lists.add(iterator.next());
        }

        lists.sort(Comparator.reverseOrder());

        System.out.println("[중복제거]내림차순으로 Stream을 사용하지 않고 출력: ");
        System.out.println(lists.toString());

        System.out.println("[중복제거]내림차순으로 Stream을 사용하고 출력");
        System.out.println("기본 형식");
        IntStream stream = Arrays.stream(arr);
        Stream<Integer> boxed = stream.boxed();
        Stream<Integer> distinct = boxed.distinct();
        Stream<Integer> sorted = distinct.sorted(Comparator.reverseOrder());
        List<Integer> collect = sorted.toList();
        System.out.println(collect);

        System.out.println("[추천]간략 형식");
        List<Integer> arr1 = Arrays.stream(arr) // 배열 추가
                .boxed() // int -> Integer
                .distinct() // 중복 제거
                .sorted(Comparator.reverseOrder()) // 내림차순(Descending) 변환
                .collect(Collectors.toList());// 배열을 수집
        System.out.println(arr1);

    }
}
