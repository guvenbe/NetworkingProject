package com.guvenbe.sockets;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(9091);
            System.out.println("waiting for clients");
            Socket socket = serverSocket.accept();
            //True to true to turn on auto flush
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println("Hello client!");
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String clientInput = input.readLine();
            System.out.println(clientInput);
            input.close();
            out.close();
            socket.close();

        } catch (IOException e) {
            //System.out.println("port " + port + " is open! (used)");
            //e.printStackTrace();
        }

    }

}

