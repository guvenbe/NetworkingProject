package com.guvenbe.sockets;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyIpAddress {
    public static void main(String[] args) {
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            if(localHost!=null){
                System.out.println("HostName: " + localHost.getHostName());
                InetAddress[] ipHosts = InetAddress.getAllByName(localHost.getHostName());
                System.out.println("------------------------------------");
                for (InetAddress ip : ipHosts) {
                    System.out.println("IP Address:" + ip.getHostAddress() );
                    System.out.println("LoopBack: " + ip.isLoopbackAddress());
                    System.out.println("-------------------------------------");
                }
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
