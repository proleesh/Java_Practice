package com.proleesh.ex33.switchtest;

public class SwitchTest {
    void main(){
        int week = 8;
        String memo = "";
        switch(week){
            case 1 -> memo = "일요일, 휴가";
            case 2,3,4,5,6 -> memo = "출근";
            case 7 -> memo = "토요일, 휴가";
            default -> throw new RuntimeException("날짜값 무효");
        }
        System.out.println(STR."\{memo}");
    }
}
