package com.proleesh.ex21.sec07;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        Book b1 = new Book("Sex King", "Seoul Tech");
        Book b2 = new Book("Lion King", "USA Company");

        Cart cart = new Cart();
        cart.add(b1);
        // normal
        System.out.println(cart.checkForDuplicate(b1));
        // because not add
        System.out.println(cart.checkForDuplicate(b2));

        cart.add(b2);
        System.out.println(cart.checkForDuplicate(b2));

        List<Book> books = cart.getAllBooks();
        Cart.printAllBooksWithFor(books);

        Cart.printAllBooksWithIterator(books);

        Cart.printAllBooksWithListIterator(books);

    }
}
