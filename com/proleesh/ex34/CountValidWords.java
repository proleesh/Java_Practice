package com.proleesh.ex34;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountValidWords {
    public static void main(String[] args) {
        String sentence = "cat and dog";
        CountValidWords c = new CountValidWords();
        c.countValidWords(sentence);
        System.out.println();

        sentence = "!this 1-s b8d";
        c.countValidWords(sentence);

        System.out.println();
        sentence = "alice and bob are playing stone-game10";
        c.countValidWords(sentence);

    }

    public int countValidWords(String sentence){
        String[] tokens = sentence.split(" ");
        String regex = "([a-z]+-?[a-z]+(\\.|!|,)?)|([a-z]*(\\.|!|,)?)";
        int res = 0;
        Pattern pattern = Pattern.compile(regex);
        for(String token : tokens){
            Matcher matcher = pattern.matcher(token.trim());
            if(matcher.matches() && token != ""){
                System.out.println(token.trim());
                res++;
            }
        }
        return res;
    }
}
