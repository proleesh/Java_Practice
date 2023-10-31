package com.proleesh.ex21.sec06;

import java.util.List;

public class Player {
    public static void play(List<? extends Content> playList){
        for(Content content : playList){
            System.out.println("재생: " + content.getTitle());
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public static void addRecommendedContent(List<? super Music> playList){
        Music music = new Music("Everything~");
        playList.add(music);
    }
}
