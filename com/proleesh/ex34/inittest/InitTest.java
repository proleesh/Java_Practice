package com.proleesh.ex34.inittest;

class Cat{
    // Definition instance variable about name, age
    String name;
    int age;

    public Cat(String name, int age) {
        System.out.println("Running about all arguments construction");
        this.name = name;
        this.age = age;
    }
    {
        System.out.println("running about non-static init block");
        weight = 2.0;
    }
    // Definition about appoint initialize value
    double weight = 2.3;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
public class InitTest {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Kim", 15);
        System.out.println(cat1);
        Cat cat2 = new Cat("Lee", 20);
        System.out.println(cat2);
    }
}
