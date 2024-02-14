package com.proleesh.ex31.test10;

public class TestMain {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.setName("홍길동");
        System.out.println(c1);

        ICustomer hong = new Customer();
        Intermediary lee = new Intermediary();
        System.out.println((lee.findHouse(hong) == null)? "Find it!":"Not Found!");
    }
}
