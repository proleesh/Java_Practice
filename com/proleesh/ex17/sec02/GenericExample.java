package com.proleesh.ex17.sec02;

public class GenericExample {
    public static void main(String[] args) {
        Product<Tv, String> product1 = new Product<>();

        product1.setKind(new Tv());
        product1.setModel("스마트Tv");


        Tv tv = product1.getKind();
        tv.setName("TV");
        String tvModel = product1.getModel();

        System.out.println("상품 종류: " + tv.getName());
        System.out.println("상품 모델: " + tvModel);

        Product<Car, String> product2 = new Product<>();

        product2.setKind(new Car());
        product2.setModel("MVP사용자");

        Car car = product2.getKind();
        car.setName("Car");
        String carModel = product2.getModel();

        System.out.println("상품 종류: " + car.getName());
        System.out.println("상품 모델: " + carModel);
    }
}
