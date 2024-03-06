package com.proleesh.ex33;
@FunctionalInterface
interface Moveable{
    void move();

    boolean equals(Object o);
}

class Person implements Moveable{
    private String name;
    Person(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void move() {
        System.out.println("Moving");
    }
}

public class CommonBuiltInAnnotations {
    public static void main(String[] args) {
        Person sk = new Person("Sean Kennedy");
        System.out.println(sk);
        sk.move();
    }
}
