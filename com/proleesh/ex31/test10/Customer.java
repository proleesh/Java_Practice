package com.proleesh.ex31.test10;

public class Customer implements ICustomer{
    public String name;

    @Override
    public void findHouse(IHouse house) {
        house.Housing();
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                '}';
    }
}
