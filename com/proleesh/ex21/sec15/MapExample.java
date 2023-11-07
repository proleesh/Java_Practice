package com.proleesh.ex21.sec15;

import java.util.ArrayList;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("홍길동", 85));
        studentList.add(new Student("홍길동", 92));
        studentList.add(new Student("홍길동", 87));

        // 점수 가져오기
        studentList.stream()
                .mapToInt(Student::getScore)
                .forEach(System.out::println);

        // 이름 가져오기
        studentList.stream()
                .map(Student::getName)
                .forEach(System.out::println);
    }
}
