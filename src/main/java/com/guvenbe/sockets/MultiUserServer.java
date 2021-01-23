package com.guvenbe.sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiUserServer {
//    public static void main(String[] args) {
//
//        try(ServerSocket serverSocket = new ServerSocket(9091);
//            Socket socket = serverSocket.accept();
//            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
//            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//        ) {
//
//            System.out.println("wainting for clients...");
//            boolean stop = false;
//            while (!stop) {
//                out.println("Hello  client!");
//                String clientInput = input.readLine();
//                System.out.println(clientInput);
//                //stop=true;
//                //System.out.println(stop);
//            }
//            System.out.println("Here");
//
//        } catch (Exception e) {
//            System.out.println(e.toString());
//        }
//    }
public static void main(String [] args) //throws Exception
{
    try
    {
        ServerSocket serverSocket = new ServerSocket(9090);
        System.out.println("wainting for clients...");
        boolean stop = false;
        while(!stop)
        {
            Socket socket = serverSocket.accept();
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println("Hello  client!");
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String clientInput = input.readLine();
            System.out.println(clientInput);
            input.close();
            out.close();
            socket.close();
        }
        serverSocket.close();

    } catch (Exception e)
    {
        System.out.println(e.toString());
    }
}
}



