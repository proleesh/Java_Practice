package com.proleesh.ex34.pricetest;

class Price{
    // class member is Price instance
    final static Price INSTANCE = new Price(2.8);
    // def a class var
    static double initPrice = 20;
    // def this currentPrice in Price instance var
    double currentPrice;
    public Price(double discount){
        currentPrice = initPrice - discount;
    }
}
public class PriceTest {
    public static void main(String[] args) {
        System.out.println(Price.INSTANCE.currentPrice);
        Price p = new Price(2.8);
        System.out.println(p.currentPrice);
    }
}
