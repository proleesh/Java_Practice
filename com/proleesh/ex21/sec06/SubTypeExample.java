package com.proleesh.ex21.sec06;

import java.util.ArrayList;
import java.util.List;

public class SubTypeExample {
    public static void main(String[] args) {
        List<Music> musicList = new ArrayList<>();
        musicList.add(new Music("I Do"));
        musicList.add(new Music("I Love You"));

        Player.play(musicList);

        System.out.println("~~~~~~~~~~~~~~~~~~");

        Player.addRecommendedContent(musicList);

        Player.play(musicList);

        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("Sex city"));
        movieList.add(new Movie("Top Gun"));
        movieList.add(new Movie("Mission impossible"));

        Player.addFavoriteContent(movieList);
        Player.play(movieList);
    }
}
