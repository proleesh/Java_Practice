package com.proleesh.ex25.sec11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MatchTest {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alan", "Brian", "Colin");
        Predicate<String> predicate = name -> name.startsWith("A");
        // 하나만 A로 시작한 단어 -> 참
        System.out.println(names.stream().anyMatch(predicate));
        // 다 A로 시작한 단어 -> 거짓
        System.out.println(names.stream().allMatch(predicate));
        // A로 시작한 단어 없음 -> 거짓
        System.out.println(names.stream().noneMatch(predicate));
    }
}
