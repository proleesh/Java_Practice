package com.proleesh.ex23.sec03;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> totalList = new ArrayList<>();
        totalList.add(new Student("홍길동", "남", 92));
        totalList.add(new Student("오해원", "여", 99));
        totalList.add(new Student("설윤아", "여", 99));
        totalList.add(new Student("김수로", "남", 78));

        List<Student> maleList = totalList.stream()
                .filter(s->s.getSex().equals("여"))
                .toList();
        maleList.forEach(s -> System.out.println(s.getName()));

        System.out.println();

        Map<String, Integer> map = totalList.stream()
                .collect(
                        Collectors.toMap(
                                Student::getName,
                                Student::getScore
                        )
                );
        System.out.println(map);
    }
}
