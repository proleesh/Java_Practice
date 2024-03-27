package com.proleesh.ex33.record;

public class LocalRecordTest {
    public static void main(String[] args) {
        // local record
        record SaleRecord(Integer saleId, String productName, Double money){}
        SaleRecord sr = new SaleRecord(1, "iPhone 15", 99999.0);
        System.out.println(sr);


    }
}
