package com.proleesh.ex21.sec09;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍길동",10),
                new Student("이순신",20),
                new Student("김부식",30)
        );
        // 방법 1
//        Stream<Student> studentStream = list.stream();
//        // 중간 처리(학생 객체를 점수로 매핑)
//        IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());
//        // 최종 처리(평균 점수)
//        double avg = scoreStream.average().getAsDouble();

        // 방법 2
        double avg = list.stream()
                        .mapToInt(Student::getScore)
                                .average()
                                        .getAsDouble();
        System.out.println("평균 점수: " + avg);

        System.out.print("이름: ");
        list.stream().map(Student::getName)
                .forEach(name -> System.out.print(name + " "));

        System.out.println();

        System.out.print("점수: ");
        list.stream().mapToInt(Student::getScore)
                .forEach(score -> System.out.print(score + " "));
    }
}
