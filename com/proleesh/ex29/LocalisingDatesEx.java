package com.proleesh.ex29;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class LocalisingDatesEx {
    public static void main(String[] args) {
        Locale locUS = Locale.US;
        Locale locJapan = new Locale("jp", "JP");
        Locale locTaiwan = Locale.TAIWAN;

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        System.out.println(dateTimeFormatter.withLocale(locTaiwan).format(now));
        System.out.println(dateTimeFormatter.withLocale(locJapan).format(now));

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(dateTimeFormatter1.withLocale(locTaiwan).format(now));
        System.out.println(dateTimeFormatter1.withLocale(locJapan).format(now));


    }
}
