package com.proleesh.ex33.record;

import java.lang.reflect.RecordComponent;

public class PersonalInfoTest {
    void main() {
        Address addr = new Address("Seoul", "Seoul, South Korea", "01000");
        PhoneNumber pn = new PhoneNumber("010-1234-5678");
        Customer customer = new Customer(1, "Janne Kim", pn.number(), addr.address());


        System.out.println(pn.returnNum());
        System.out.println(customer.phoneNumber());
        System.out.println(customer);
        System.out.println(customer.info());

        boolean record = customer.getClass().isRecord();
        System.out.println(record);

        RecordComponent[] recordComponents = customer.getClass().getRecordComponents();
        for(RecordComponent recordComponent : recordComponents){
            System.out.println(STR."recordComponent = \{recordComponent}");
        }
    }
}
