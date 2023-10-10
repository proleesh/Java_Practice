package com.proleesh.ex12.instance;

public class Student extends Person{
    protected int studentNo;


    public Student(String name, int studentNo) {
        super(name);
        this.studentNo = studentNo;
    }


    @Override
    public void walk() {
        System.out.println("학생이 걷는중...");
    }
    public void study(){
        System.out.println("공부하는 중...");
    }
}
