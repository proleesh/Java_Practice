package com.proleesh.ex33.factorypattern;

public abstract class Coffee {
    abstract int getPrice();

    @Override
    public String toString() {
        return "Hi this coffee is  " + this.getPrice();
    }
}
