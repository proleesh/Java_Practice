package com.proleesh.ex34.arraybasic;
class Cat{
    double weight;
    int age;

    public Cat(double weight, int age) {
        this.weight = weight;
        this.age = age;
    }
}
public class ArrayTest4 {
    public static void main(String[] args) {
        int[] pos = new int[5];
        for(int i = 0; i < pos.length; ++i){
            pos[i] = (i + 1) * 2;
        }
        int a = pos[1];
        System.out.println(a);
        int b = 20;
        pos[2] = b;
        System.out.println(pos[2]);
        Cat[] cats = new Cat[2];
        cats[0] = new Cat(3.34, 2);
        Cat c1 = cats[0];
        Cat c2 = new Cat(4.3, 3);
        cats[1] = c2;

        System.out.println(c1.weight + " " + c1.age);

        for(int i = 0; i < cats.length; ++i){
            System.out.println("weight: " + cats[i].weight + " , age: " + cats[i].age);
        }
    }
}
