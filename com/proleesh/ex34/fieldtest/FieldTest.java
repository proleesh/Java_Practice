package com.proleesh.ex34.fieldtest;
/*
static을 붙인 variable은 class variable
안 붙인것은 instance variable이다.
같은 JVM에서 한개의 객체당 한개의 class를 지향하다, 클래스는 많은 Java 객체가 만들 수 있다.
한 객체의 변수는 한 블록의 메모리 할당이 필요하다
클래스 variable의 경우, 객체 생성당 클래스 variable에게 한 블록의
메모리 할당이 필요하다
instance have to many memory space in JVM.
 */
class Person{
    String name;
    int age;
    static int eyeNum;
    public void info(){
        System.out.println("이름: " + name +
                ", 나이: " + age);
    }
}
public class FieldTest {
    public static void main(String[] args) {
        /*
        즉 instance 변수는 클래스 자체이다.
        객체의 초기화 완성시 프로그램은 이 변수를 직접 쓸 수 있다.
        여기서 객체 Person가 직접 eyeNum라는 인스턴스 변수를 접근한다.
         */
        Person.eyeNum = 2;
        // 객체 Person을 통해 집접 eyeNum라는 class var를 호출
        System.out.println("Person.eyeNum: " + Person.eyeNum);

        // Create new instance about Person class
        Person p = new Person();
        p.name = "Java";
        p.age = 2024 - 1994;
        System.out.println("P변수를 통해 eyeNum클래스 변수 접근: " + p.eyeNum);
        p.info();

        Person p2 = new Person();
        p2.name = "C";
        p2.age = 2024 - 1971;
        // p2 변수를 통해 Person의 클래스 변수 eyeNum 수정
        p2.eyeNum = 3;
        System.out.println("P변수를 통해 eyeNum클래스 변수 접근: " + p.eyeNum); // 3
        System.out.println("P2변수를 통해 eyeNum클래스 변수 접근: " + p2.eyeNum); // 3
        System.out.println("Person 클래스를 통해 eyeNum클래스 변수 접근: " + Person.eyeNum); // 3

        /*
        마지막 세개의 출력코드는 똑같이 나옵니다. 왜 이럴까요?
        이유는 p2라는 변수가 Person클래스 변환을 통해 직접 메모리상의 값을 수정한다.
        이때 eyeNum이라는 class variable의 값은 완전히 새로운 값으로 바뀐다.
        eyeNum은 실제로 Person class에 속하지 않는다. 즉 독립적인 존재로도 볼 수 있다.
        그러므로 모든 Person class에 있는
        instance variable(Member field but not contain about class variable)는 eyeNum에 접근이 가능하다.
        이게 Java언어의 특징중 하나이다.
         */

    }
}
