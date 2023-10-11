package com.proleesh.ex13.sec03;

public class Human implements SearchEngine,BrowserChoose{
    private String name;
    private String url;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void browserChoose(String browserName) {
        System.out.println("선택한 Browser: " + browserName);
    }

    @Override
    public void v8(String url) {
        System.out.println("[재정의]검색할 주소: " + url);
    }
}
