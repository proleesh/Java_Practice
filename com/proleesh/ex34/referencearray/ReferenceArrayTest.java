package com.proleesh.ex34.referencearray;

class Person{
    public int age;
    public double height;
    public void info(){
        System.out.println("나이: " + age + ", 키 높이: " + height);
    }
}
public class ReferenceArrayTest {
    public static void main(String[] args) {
        Person[] students;
        students = new Person[2];
        System.out.println("students reference의 길이: " + students.length);
        Person lee = new Person();
        lee.age = 18;
        lee.height = 181.0;
        Person kim = new Person();
        kim.age = 29;
        kim.height = 165.4;
        students[0] = lee;
        students[1] = kim;
        lee.info();
        students[1].info();
    }
}
