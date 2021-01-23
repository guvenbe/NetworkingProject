package com.guvenbe.sockets;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetByName {
    public static void main(String[] args) {

        InetAddress obj1 = null;
        try {
            obj1 = InetAddress.getByName("udemy.com");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        System.out.print(obj1.getHostName());
    }
}


