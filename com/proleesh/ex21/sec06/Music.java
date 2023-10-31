package com.proleesh.ex21.sec06;

public class Music implements Content{
    private String song;
    @Override
    public String getTitle() {
        return this.song;
    }

    public Music(String song) {
        this.song = song;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }
}
