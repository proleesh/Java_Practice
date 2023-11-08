package com.proleesh.ex23.sec01;

public class Page {
    private int no;
    private String contents;

    public Page(int no, String contents) {
        this.no = no;
        this.contents = contents;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "Page{" +
                "no=" + no +
                ", contents='" + contents + '\'' +
                '}';
    }
}
