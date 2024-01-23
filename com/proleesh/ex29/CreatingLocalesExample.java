package com.proleesh.ex29;

import java.util.Locale;

public class CreatingLocalesExample {
    public static void main(String[] args) {
        System.out.println(new Locale("ko"));
        Locale locale = new Locale("ko", "KR");
        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getDisplayCountry());

        System.out.println(Locale.JAPAN);
        Locale locJP = Locale.JAPAN;
        System.out.println(locJP.getDisplayLanguage());
        System.out.println(locJP.getDisplayCountry());

        System.out.println(Locale.US);
        System.out.println(Locale.CHINA);
        System.out.println(Locale.TAIWAN);

        Locale locTaiwan = new Locale.Builder()
                .setRegion("TW")
                .setLanguage("zh")
                .build();
        System.out.println(locTaiwan);
    }
}
