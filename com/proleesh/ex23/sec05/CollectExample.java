package com.proleesh.ex23.sec05;

import com.proleesh.ex23.sec03.Student;

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

        Map<String, Double> map = totalList.stream()
                .collect(
                        Collectors.groupingBy(
                                Student::getSex,
                                Collectors.averagingDouble(Student::getScore)
                        )
                );

        System.out.println(map);
    }
}
