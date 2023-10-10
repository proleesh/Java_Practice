package com.proleesh.ex12.sealedclass;

public non-sealed class Manager extends Person {
    @Override
    public void work() {
//        super.work();
        System.out.println("생산 관리를 합니다.");
    }
}
