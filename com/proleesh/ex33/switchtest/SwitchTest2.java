package com.proleesh.ex33.switchtest;

public class SwitchTest2 {
    void main(){
        int week = 2;
        String memo = switch(week){
            case 1: yield "일요일";
            case 2,3,4,5,6 : yield "출근";
            case 7: yield "토요일";
            default: yield "날짜값 무효";
        };
        System.out.println("memo = " + memo);
    }
}
