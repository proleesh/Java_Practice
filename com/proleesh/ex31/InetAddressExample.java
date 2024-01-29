package com.proleesh.ex31;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
    public static void main(String[] args) {
        try{
            InetAddress local = InetAddress.getLocalHost();
            System.out.println("My PC IP: " + local.getHostAddress());

        }catch(UnknownHostException e){
            e.printStackTrace();
        }
    }
}
