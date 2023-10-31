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

        System.out.println();
        Book b1 = new Book("Java Basic", "KOREA IT", 20230101);
        Book b2 = new Book("Spring Boot", "KOREA IT", 20230101);
        Book b3 = new Book("Python Basic", "JAPAN IT", 20221201);

        Cart<Book> c2 = new Cart<>();
        c2.add(b1);
        c2.add(b2);
        c2.add(b3);

        c2.printAllItems();
    }
}
