package com.proleesh.ex17.sec07;

public class GenericExample {
    public static void main(String[] args) {
        Course.registerCourse(new Applicant<Person>(new Person()));
        Course.registerCourse(new Applicant<Worker>(new Worker()));
        Course.registerCourse(new Applicant<Student>(new Student()));
        Course.registerCourse(new Applicant<HighStudent>(new HighStudent()));
        Course.registerCourse(new Applicant<MiddleStudent>(new MiddleStudent()));
        System.out.println();

        Course.registerCourse2(new Applicant<Student>(new Student()));
        Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
        System.out.println();

        Course.registerCourse3(new Applicant<Person>(new Person()));
        Course.registerCourse3(new Applicant<Worker>(new Worker()));
    }
}
