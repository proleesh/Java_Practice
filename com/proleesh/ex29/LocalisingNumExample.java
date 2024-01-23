package com.proleesh.ex29;

import java.text.NumberFormat;
import java.util.Locale;

public class LocalisingNumExample {
    public static void main(String[] args) {
        formatNums();
        formatCurrencies();
    }

    public static void formatNums(){
        double n = 77_000.11;
        System.out.println(NumberFormat.getInstance().format(n));
        System.out.println(NumberFormat.getInstance(Locale.CHINA).format(n));
        System.out.println(NumberFormat.getInstance(Locale.KOREA).format(n));
        System.out.println(NumberFormat.getInstance(Locale.US).format(n));
    }

    public static void formatCurrencies(){
        double n = 18.24;
        System.out.println(NumberFormat.getCurrencyInstance().format(n));
        System.out.println(NumberFormat.getCurrencyInstance(Locale.CHINA).format(n));
        System.out.println(NumberFormat.getCurrencyInstance(Locale.TAIWAN).format(n));
        System.out.println(NumberFormat.getCurrencyInstance(Locale.JAPAN).format(n));
        System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(n));
        System.out.println(NumberFormat.getCurrencyInstance(Locale.FRANCE).format(n));
    }
}
