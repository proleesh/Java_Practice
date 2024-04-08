package com.proleesh.ex31.assign;


public class TestMain {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.setX(10);
        shape.setY(10);
        System.out.println("10x10정사각형 면적: " + shape.area());

        Shape triangle = new Triangle();
        triangle.setX(10);
        triangle.setH(5);
        System.out.println("길이: 10, 높이: 5의 삼각형 면적 " + triangle.area());

        Circle circle = new Circle();
        circle.setR(20);
        System.out.println("반지름: 20인 원의 면적은 약 " + circle.area());


    }
}
