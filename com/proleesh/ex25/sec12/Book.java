package com.proleesh.ex25.sec12;

public class Book implements Comparable<Book>{

    private int no;
    private String title;

    public Book(int no, String title) {
        this.no = no;
        this.title = title;
    }

    public int getNo() {
        return no;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "no=" + no +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public int compareTo(Book book) {
        int res = Integer.valueOf(no).compareTo(book.getNo()) * -1;
        if(res == 0){
            res = title.compareTo(book.getTitle());
        }
        return res;
    }
}
