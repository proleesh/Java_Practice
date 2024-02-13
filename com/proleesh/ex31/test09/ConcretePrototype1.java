package com.proleesh.ex31.test09;

public class ConcretePrototype1 extends Prototype{
    public ConcretePrototype1(String id) {
        super(id);
    }

    @Override
    Prototype Clone() {
        return new ConcretePrototype1(this.getId());
    }
}
