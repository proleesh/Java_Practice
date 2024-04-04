package com.proleesh.ex33.switchtest.recordsw;

public class SwitchTest {
    void main(){
        Line line = new Line(10, 20);
        Rectangle rectangle = new Rectangle(20, 50);
        Shape shape = new Shape(50, 80);

//        Object obj = line;
        Object obj = rectangle;
        int result = switch (obj){
            case Line(int x, int y) -> {
                System.out.println("그래프 Line x:"+x+", y:" + y);
                yield x + y;
            }
            case Rectangle(int w, int h) -> 2 * (w + h);
            case Shape(int width, int height) -> {
                System.out.println("그래프 Shape");
                yield width * height;
            }
            default -> 0;
        };
        System.out.println(result);
    }
}
