package com.proleesh.ex26.sec03;



class Foo{
    private int foolValue;

    public Foo(int foolValue) {
        this.foolValue = foolValue;
    }

    public int getFoolValue() {
        return foolValue;
    }

    @Override
    public boolean equals(Object obj) {
        if((obj instanceof Foo) && (((Foo)obj).getFoolValue() == this.foolValue)){
            return true;
        }else{
            return false;
        }
    }
}
public class EqualsTest {
    public static void main(String[] args) {
        Foo f1 = new Foo(2);
        Foo f2 = new Foo(2);
        System.out.println(f1.equals(f2));
    }
}
