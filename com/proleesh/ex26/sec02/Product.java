package com.proleesh.ex26.sec02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Product implements Comparable<Product>{
    private Integer id;

    public Product(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return id.compareTo(o.id);
    }
}
class SortingProducts{
    public static void main(String[] args) {
        comparable();
    }
    public static void comparable(){
        List<Product> products = new ArrayList<>();
        products.add(new Product(77));
        products.add(new Product(44));
        products.add(new Product(23));
        Collections.sort(products);
        System.out.println(products);
    }
}