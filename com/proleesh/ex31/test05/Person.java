package com.proleesh.ex31.test05;

public class Person {

    private String name;
    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.print(name + "의 코디는 ");
    }
}
