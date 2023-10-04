package com.proleesh.ex07;

class Line{
    int value;
    public Line(int value){
        this.value = value;
    }

    public boolean isSameLine(Line line){
        return this.value == line.value;
    }

}
public class LineTest {
    public static void main(String[] args) {
        Line a = new Line(1);
        Line b = new Line(1);

        System.out.println(a.isSameLine(b));
        System.out.println(a == b);
    }
}
