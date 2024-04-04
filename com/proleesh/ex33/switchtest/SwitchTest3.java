package com.proleesh.ex33.switchtest;

public class SwitchTest3 {
    void main(){
        int week = 5;
        String memo = switch(week){
            case 1 -> {
                System.out.println("일요일, Running definition code");
                yield "일요일";
            }
            case 2, 3, 4, 5, 6 -> {
                System.out.println("출근, Running definition code");
                yield "2-6 출근일";
            }
            case 7 -> {
                System.out.println("토요일, Running definition code");
                yield "토요일";
            }
            default -> {
                System.out.println("Running definition code");
                yield "기타일정";
            }
        };
        System.out.println(memo);

    }
}
