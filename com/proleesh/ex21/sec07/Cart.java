package com.proleesh.ex21.sec07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Cart {
    private List<Book> books;

    public Cart(){
        books = new ArrayList<>();
    }
    public void add(Book book){
        books.add(book);
    }
    public void add(int index, Book book){
        books.add(index, book);
    }

    public boolean checkForDuplicate(Book book){
        return books.contains(book);
    }

    public List<Book> getAllBooks(){
        return books;
    }

    public Book getBook(int index){
        return books.get(index);
    }

    public static void printAllBooksWithFor(List<Book> books){
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.println(book);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public static void printAllBooksWithIterator(List<Book> books){
        for(Iterator<Book> bookIterator = books.iterator(); bookIterator.hasNext();){
            System.out.println(bookIterator.next());
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public static void printAllBooksWithListIterator(List<Book> books){
        ListIterator<Book> listIterator = books.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
    }


}
