package com.proleesh.ex14.sec01;

import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int week_of_month = cal.get(Calendar.WEEK_OF_MONTH);
        System.out.println("몇 주차: " + week_of_month + "주 차");
        int month = cal.get(Calendar.MONTH);
        System.out.println("이 번달: " + month + "월");
        int day = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("몇일: " + day + "일");
        int hour = cal.get(Calendar.HOUR);
        System.out.println("몇시: " + hour);
        int minute = cal.get(Calendar.MINUTE);
        System.out.println("몇분: " + minute);
        int second = cal.get(Calendar.SECOND);
        System.out.println("몇초: " + second);
        int amPm = cal.get(Calendar.AM_PM);
        if(amPm == 0){
            System.out.println("오전 입니다.");
        }else{
            System.out.println("오후 입니다.");
        }
        int year = cal.get(Calendar.YEAR);
        System.out.println("년도: " + year );

    }
}
