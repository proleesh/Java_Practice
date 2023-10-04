package com.proleesh.ex07;

public class Student {
    String name;

    Student(String name){
        this.name = name;
    }

    Student(){
        this("no name");
        System.out.println("no argument");
    }
}

class StudentTest{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("홍길동");
        System.out.println("s2의 이름: " + s2.name);

    }
}