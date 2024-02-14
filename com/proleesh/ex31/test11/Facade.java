package com.proleesh.ex31.test11;

public class Facade {
    SubSystemOne one;
    SubSystemTwo two;
    SubSystemThree three;
    SubSystemFour four;

    public Facade() {
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
        four = new SubSystemFour();
    }
    public void MethodA(){
        System.out.println("Method Group A --- ");
        one.MethodOne();
        two.MethodTwo();
        three.MethodThree();
    }

    public void MethodB(){
        System.out.println("Method Group B --- ");
        one.MethodOne();
        four.MethodFour();
        three.MethodThree();
    }
}
