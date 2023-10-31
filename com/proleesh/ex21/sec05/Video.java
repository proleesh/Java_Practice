package com.proleesh.ex21.sec05;

public class Video {
    private String title;
    private String publisher;

    public Video(String title, String publisher) {
        this.title = title;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
