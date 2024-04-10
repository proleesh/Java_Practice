package com.proleesh.ex31.test13.sealedtest;

public class TestSealed {
    void main(){
        Shape square = new Square();
        square.draw();

        Shape circle = new Circle();
        circle.draw();

        Shape rectangle = new Rectangle();
        rectangle.draw();

        Shape line = new Line();
        line.draw();

        Shape rs = new RoundSquare();
        rs.draw();
    }
}
