package com.proleesh.ex12.sealedclass;

public class Director extends Manager{
    @Override
    public void work() {
//        super.work();
        System.out.println("제품을 기획합니다.");
    }
}
