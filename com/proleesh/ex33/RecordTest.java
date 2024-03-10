package com.proleesh.ex33;

import java.util.concurrent.atomic.AtomicLong;

public class RecordTest {

    public static void main(String[] args) {
        AtomicLong atomicLong = new AtomicLong(1L);

        RecordEntity re = new RecordEntity(atomicLong.getAndAdd(1L), "홍길동", 18);

        String string = re.toString();
        System.out.println(string);

        System.out.println("~~~~~~~~~~~");
        System.out.println(re.id());
        System.out.println(re.name());
        System.out.println(re.age());
        System.out.println("~~~~~~~~~~~");


    }
}
