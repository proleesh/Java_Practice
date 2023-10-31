package com.proleesh.ex21.sec05;

public class GenericExample {
    public static void main(String[] args) {
        Video v1 = new Video("S-001", "KOREA FILM");
        Video v2 = new Video("S-002", "JAPAN FILM");
        Video v3 = new Video("S-003", "USA Company");

        Cart<Video> c = new Cart<>();
        c.add(v1);
        c.add(v2);
        c.add(v3);

        c.printAllItems();


        Cart<Video> c2 = new Cart<>();
    }
}
