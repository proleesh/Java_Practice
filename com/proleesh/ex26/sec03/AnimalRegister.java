package com.proleesh.ex26.sec03;

class Register<T, U, V>{
    private T type;
    private U name;
    private V age;

    public Register(T type, U name, V age) {
        this.type = type;
        this.name = name;
        this.age = age;
    }

    public T getType() {
        return type;
    }

    public U getName() {
        return name;
    }

    public V getAge() {
        return age;
    }
}
class Dog{
    public Dog() {
    }

}
public class AnimalRegister {
    public static void main(String[] args) {
        Register<Dog, String, Integer> dogRegister = new Register<>(new Dog(), "Cola", 2);
        System.out.println("Type: " + dogRegister.getType());
        System.out.println("Name: " + dogRegister.getName());
        System.out.println("Age: " + dogRegister.getAge());
        Register<String, String, Integer> info1 = new Register<>("String", "Info1", 1);
        System.out.println("Type: " + info1.getType());
        System.out.println("Name: " + info1.getName());
        System.out.println("Age: " + info1.getAge());
    }
}
