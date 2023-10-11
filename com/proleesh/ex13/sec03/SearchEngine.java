package com.proleesh.ex13.sec03;

public interface SearchEngine {
    default void v8(String url){
        System.out.println("[기본]검색할 주소: " + url);
    }
}
