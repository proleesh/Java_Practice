package com.proleesh.ex25.sec01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
    public static void main(String[] args) {
        try{
            InetAddress local = InetAddress.getLocalHost();
            System.out.println("내 PC IP 주소: " + local.getHostAddress());

            InetAddress[] iaArr = InetAddress.getAllByName("www.google.com");
            for(InetAddress remote : iaArr){
                System.out.println("www.google.com IP 주소: " + remote.getHostAddress());
            }

        }catch(UnknownHostException e){
            e.printStackTrace();
        }
    }
}
