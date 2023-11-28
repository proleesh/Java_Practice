package com.proleesh.ex25.sec12;

import java.util.Comparator;

public class AscendingNo implements Comparator<Book> {

    @Override
    public int compare(Book b1, Book b2) {
        int res = Integer.valueOf(b1.getNo()).compareTo(b2.getNo());
        if(res == 0){
            res = b1.getTitle().compareTo(b2.getTitle());
        }
        return res;
    }
}
