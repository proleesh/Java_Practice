package com.proleesh.ex31.test13;

import com.sun.security.jgss.GSSUtil;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    void main(){
        String str1 = "III";
        System.out.println(romanToInteger(str1));

        String str2 = "LVIII";
        System.out.println(romanToInteger(str2));

        String str3 = "MCMXCIV";
        System.out.println(romanToInteger(str3));


    }

    public int romanToInteger(String s){
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int count = 0;
        for(int i = 0; i < s.length(); ++i){
            if(i < s.length() - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))){
                count -= map.get(s.charAt(i));
            }else{
                count += map.get(s.charAt(i));
            }
        }

        return count;

    }
}
