package com.proleesh.ex33.record;


class StudentTest {
    public static void main(String[] args) {
        Student tom = new Student(1, "Tom" , null, 20);
        System.out.println(tom);

        Student jack = new Student(2, "Jack", "jack@me.me", 28);
        System.out.println(jack);
        System.out.println(jack.concat());

        System.out.println(Student.emailToUpperCase(jack.email()));
        System.out.println(Student.emailToUpperCase(tom.email()));
        Student lucy = new Student(0, "Lucy", "lucy@me.me", 30);
        System.out.println(lucy);
    }
}