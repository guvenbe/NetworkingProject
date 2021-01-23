package com.guvenbe.sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

class ClientThread extends Thread {

    private Socket socket = null;

    public ClientThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        PrintWriter out = null;
        try {
            out = new PrintWriter(socket.getOutputStream(), true);

            out.println("Hello  client!");
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String clientInput = input.readLine();
            System.out.println(clientInput);
            input.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class MultiThreadedServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(9091);
            boolean stop = false;
            while (!stop) {
                System.out.println("Waiting clients.....");
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client is connected");
                ClientThread clientThread = new ClientThread(clientSocket);
                clientThread.start();


            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
