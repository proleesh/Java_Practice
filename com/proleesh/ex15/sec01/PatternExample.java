package com.proleesh.ex15.sec01;

import java.util.regex.Pattern;

public class PatternExample {
    public static void main(String[] args) {
        String regExp = "(02|010)-\\d{3,4}-\\d{4}";
        String data = "010-1234-5678";
        boolean result = Pattern.matches(regExp, data);
        if(result){
            System.out.println("정규식과 일치");
        }else{
            System.out.println("정규식과 일치하지 않는다.");
        }

        regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
        data = "hello@java.edu.kr";
        result = Pattern.matches(regExp, data);
        if(result){
            System.out.println("정규식과 일치");
        }else{
            System.out.println("정규식과 일치하지 않는다.");
        }

        // https://www.youtube.com 정규식
        regExp = "\\w+://\\w+\\.\\w+\\.\\w+(\\.\\w+)?";
        data = "https://www.youtube.com.kr";
        result = Pattern.matches(regExp, data);
        if(result){
            System.out.println("정규식과 일치");
        }else{
            System.out.println("정규식과 일치하지 않는다.");
        }

        // 123-4567-8910 또는 010-1234-5678
        regExp = "(123|010)-\\d{4,}-\\d{4}";
        data = "123-4567-8910";
        result = Pattern.matches(regExp, data);
        if(result){
            System.out.println("정규식과 일치");
        }else{
            System.out.println("정규식과 일치하지 않는다.");
        }
        // merci726@yahoo.com
        regExp = "\\w+\\d{2,}@\\w+\\.\\w+(\\.\\w+)?";
        data = "merci726@yahoo.com";
        result = Pattern.matches(regExp, data);
        if(result){
            System.out.println("정규식과 일치");
        }else{
            System.out.println("정규식과 일치하지 않는다.");
        }
    }
}
