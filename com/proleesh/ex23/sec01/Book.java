package com.proleesh.ex23.sec01;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Book {
    private String title;
    private Deque<Page> pageStack = new ArrayDeque<>();
    private List<Page> pageList = new LinkedList<>();
    private int currentPageNo;

    public Book(String title) {
        this.title = title;
    }

    public void addPage(Page page){
        pageList.add(page);
    }

    public void nextPage(){
        pageStack.push(pageList.get(currentPageNo++));
    }
    public void previousPage(){
            Page page = pageStack.pop();
            this.currentPageNo = page.getNo();
    }

    public void view(){
            System.out.println(pageList.get(this.currentPageNo));
    }
}
