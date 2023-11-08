package com.proleesh.ex23.sec01;

public class DequeStackExample {
    public static void main(String[] args) {
        Book book = new Book("Java Deque Stack");

        book.addPage(new Page(0, "Start"));
        book.addPage(new Page(1, "Index"));
        book.addPage(new Page(2, "Contents-1"));
        book.addPage(new Page(998, "Contents-20"));
        book.addPage(new Page(999, "End"));

        book.nextPage();
        book.view();
        book.nextPage();
        book.view();
        book.nextPage();
        book.view();
        book.previousPage();
        book.view();
    }
}
