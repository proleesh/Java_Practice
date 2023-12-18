package com.proleesh.ex26.sec02;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

class Book{
    private String title;
    private Double price;

    Book(String title, Double price){
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }
}
public class QueueTest {
    public static void main(String[] args) {
        priorityQueueNaturalOrdering();
    }

    public static void priorityQueueNaturalOrdering(){
        Queue<String> names = new PriorityQueue<>();
        names.add("B");
        names.add("C");
        names.add("A");
        Iterator<String> itNames = names.iterator();
        while(itNames.hasNext()){
            System.out.print(names.poll() + " ");
        }

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Queue<Integer> nums = new PriorityQueue<>();
        nums.add(4);
        nums.add(2);
        nums.add(5);
        Iterator<Integer> itNums = nums.iterator();
        while(itNums.hasNext()){
            System.out.print(nums.poll() + " ");
        }

        Comparator<Book> comparatorTitle = Comparator.comparing(Book::getTitle);

        Queue<Book> booksByTitle = new PriorityQueue<>(comparatorTitle);
        booksByTitle.add(new Book("Java", 24.0));
        booksByTitle.add(new Book("Python", 26.5));
        booksByTitle.add(new Book("Rust", 18.0));

        System.out.println("Ordering by title: ");
        Iterator<Book> itTitles = booksByTitle.iterator();
        while(itTitles.hasNext()){
            Book title = booksByTitle.poll();
            System.out.println(title);
        }

        Comparator<Book> comparatorPrice = Comparator.comparing(Book::getPrice);
        Queue<Book> booksByPrice = new PriorityQueue<>(comparatorPrice);
        booksByPrice.add(new Book("Java", 24.0));
        booksByPrice.add(new Book("Python", 26.5));
        booksByPrice.add(new Book("Rust", 18.0));

        System.out.println("Ordering by price: ");
        Iterator<Book> itPrices = booksByPrice.iterator();
        while(itPrices.hasNext()){
            Book price = booksByPrice.poll();
            System.out.println(price);
        }
    }
}
