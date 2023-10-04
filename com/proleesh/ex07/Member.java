package com.proleesh.ex07;

public class Member {
    private String name;
    private String id;
    private String password;
    private int age;

    public Member(String name, String id, String password, int age) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
class MemberTest{
    public static void main(String[] args) {
        Member m1 = new Member("Craig", "a0001", "123456", 29);
        Member m2 = new Member("Tom", "a0002", "987654", 30);
        System.out.println(m1.toString());
        System.out.println(m2.toString());
    }
}