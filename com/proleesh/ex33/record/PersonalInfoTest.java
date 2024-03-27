package com.proleesh.ex33.record;

public class PersonalInfoTest {
    public static void main(String[] args) {
        Address addr = new Address("Seoul", "Seoul, South Korea", "01000");
        PhoneNumber pn = new PhoneNumber("010-1234-5678");
        Customer customer = new Customer(1, "Janne Kim", pn.number(), addr.address());


        System.out.println(pn.returnNum());
        System.out.println(customer.phoneNumber());
        System.out.println(customer);
        System.out.println(customer.info());

    }
}
