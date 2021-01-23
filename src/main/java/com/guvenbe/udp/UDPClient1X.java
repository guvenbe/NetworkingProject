package com.guvenbe.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient1X {
    public static void main(String args[]) throws Exception
    {
        DatagramSocket clientSocket = new DatagramSocket();
        clientSocket.setSoTimeout(3000);
        InetAddress IPAddress = InetAddress.getByName("localhost");
        byte[] sendData = new byte[1024];

        boolean stop = false;

        while(!stop)
        {
            String stringSendData = "Client 1 text message";
            sendData = stringSendData.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 9091);
            clientSocket.send(sendPacket);
        }
        clientSocket.close();
    }
}
