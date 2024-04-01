package com.proleesh.ex31.test12;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    void main(){
        String str1 = "anagram";
        String str2 = "nagaram";
//        for(char c : str1.toCharArray()){
//            System.out.println(c);
//        }
        System.out.println(isAnagram(str1, str2));

        str1 = "rat";
        str2 = "car";
        System.out.println(isAnagram(str1, str2));

    }

    public boolean isAnagram(String s, String t){
        Map<Character, Integer> count = new HashMap<>();

        for(char x : s.toCharArray()){
            count.put(x, count.getOrDefault(x, 0) + 1);
        }
        for(char x : t.toCharArray()){
            count.put(x, count.getOrDefault(x, 0) - 1);
        }
        for(int val : count.values()){
            if(val != 0){
                return false;
            }
        }
        return true;
    }
}
