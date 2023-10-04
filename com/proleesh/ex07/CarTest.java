package com.proleesh.ex07;

class Car{
    static String color;
    static int cnt;
    static int cnt2;

    public Car(String color) {
        Car.color = color;
        cnt++;
        if(Car.color != null && (Car.color.equals("RED") || Car.color.equals("red"))){
            cnt2++;
        }
    }

    public static int getNumOfCar(){
        return cnt;
    }
    public static int getNumOfRedCar(){
        return cnt2;
    }
}
public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car("red");
        Car c2 = new Car("blue");
        Car c3 = new Car("RED");
//        Car c4 = new Car("RED");
//        Car c5 = new Car("RED");
//        Car c6 = new Car("RED");

        System.out.printf("자동차 수 : %d, 빨간색 자동차 수 : %d",
                Car.getNumOfCar(), Car.getNumOfRedCar());
    }
}
