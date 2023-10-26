package com.proleesh.ex20;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(87);
        scores.add(77);
        scores.add(65);
        scores.add(49);
        scores.add(99);
        scores.add(62);

        for (Integer s:
             scores) {
            System.out.print(s + " ");
        }
        System.out.println("\n");


        System.out.println("가장 낮은 점수 : " + scores.first());
        System.out.println("가장 높은 점수 : " + scores.last());
        System.out.println("100점 아래 점수 : " + scores.lower(100));
        System.out.println("95점 위의 점수 : " + scores.higher(95));
        System.out.println("95점 이거나 바로 아래 점수 : " + scores.floor(95));
        System.out.println("95점 이거나 바로 위의 점수 : " + scores.ceiling(95));
        System.out.println("\n");

        // 내림 차순
        NavigableSet<Integer> descendingScores = scores.descendingSet();
        for(Integer s : descendingScores){
            System.out.print(s + " ");
        }
        System.out.println("\n");

        // 80보다 큰 수
        NavigableSet<Integer> rangeSet = scores.tailSet(80, true);
        for (Integer s:
             rangeSet) {
            System.out.print(s + " ");
        }
        System.out.println("\n");

        // 80 <= n <= 100
        rangeSet = scores.subSet(80, true, 100, false);

        for (Integer s:
             rangeSet) {
            System.out.print(s + " ");
        }

    }
}
