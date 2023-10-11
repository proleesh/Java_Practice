package com.proleesh.ex13.sec13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date date = new Date();
        String now = date.toString();
        System.out.println("현재시간: " + now);

        SimpleDateFormat sdf = new SimpleDateFormat();
        String simpleNow = sdf.format(date);
        System.out.println("현재시간: " + simpleNow);

    }
}
