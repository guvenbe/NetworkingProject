package com.guvenbe.sockets;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class InetAddressExample {
    public static void main(String[] args) {

        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println(address.getHostAddress());
            System.out.println(address.getHostName());
            InetAddress address1 = InetAddress.getByName("google.com");
            System.out.println(address1.getHostAddress());
            System.out.println(address1.getHostName());
            Socket socket = new Socket(address, 9091);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
