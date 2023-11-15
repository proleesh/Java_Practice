package com.proleesh.ex24.sec12;

import java.io.Serial;
import java.io.Serializable;

public class Product implements Serializable {

    @Serial
    private static final long serialVersionUID = 1812126033125602946L;
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
