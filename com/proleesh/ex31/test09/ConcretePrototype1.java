package com.proleesh.ex31.test09;

public class ConcretePrototype1 extends Prototype{
    public ConcretePrototype1(String id) {
        super(id);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
