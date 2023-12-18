package com.proleesh.ex26.sec01;

import java.util.*;

public class StreamEx01 {
    public static void main(String[] args) {
        int[] arr = {42, 24, 22, 42, 55, 85, 22};
        List<Integer> lists = new ArrayList<>();
        Set<Integer> sets = new HashSet<>();

        for(int i = 0; i < arr.length; ++i){
            sets.add(arr[i]);
        }

        Iterator<Integer> iterator = sets.iterator();
        for(int i = 0; iterator.hasNext(); ++i){
            lists.add(iterator.next());
        }
        lists.sort(Comparator.reverseOrder());

        System.out.println("[중복제거] 내림차순으로 Stream을 사용하지 않고 출력: ");
        System.out.println(lists.toString());
    }
}
