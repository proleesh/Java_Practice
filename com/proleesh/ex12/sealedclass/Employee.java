package com.proleesh.ex12.sealedclass;

public final class Employee extends Person {
    @Override
    public void work() {
        System.out.println("제품을 생산합니다.");
    }
}
