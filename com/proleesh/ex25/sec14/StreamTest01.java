package com.proleesh.ex25.sec14;

import java.util.*;

public class StreamTest01 {
    public static void main(String[] args) {
        int[] A = {32, 44, 22, 33, 32, 44, 22, 48};
        // distinct 중복을 제거하기 위해 set
        Set<Integer> sets = new HashSet<>();
        // 내림차순 정렬
        List<Integer> lists = new ArrayList<>();

        for(int i = 0; i < A.length; ++i){
            sets.add(A[i]);
        }

        Iterator<Integer> iterator = sets.iterator();

        for(int i = 0; iterator.hasNext(); ++i){
            lists.add(iterator.next());
        }

        // 오름 차순
//        lists.sort(Comparator.naturalOrder());

        // 내림 차순
        lists.sort(Comparator.reverseOrder());

        System.out.println(lists.toString());
    }
}
