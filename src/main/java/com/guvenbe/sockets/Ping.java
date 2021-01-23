package com.guvenbe.sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ping {
    public static void main(String [] args) throws Exception
    {
        try
        {
            String hostAddress = "google.com";
            InetAddress host = InetAddress.getByName(hostAddress);
            //System.out.println(host.isReachable(1000));


            Process p = Runtime.getRuntime().exec("sudo ping " + hostAddress);
            //Process p = Runtime.getRuntime().exec("sudo ls -l");
            BufferedReader inputStream = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String commandOutput = "";
            boolean isReachable = true;
            // reading output stream of the command
            while ((commandOutput = inputStream.readLine()) != null) {
                System.out.println(commandOutput);

                if(commandOutput.contains("Destination host unreachable"))
                {
                    isReachable = false;
                    break;
                }

            }

            if(isReachable)
            {
                System.out.println("Host is reachable!");
            }
            else
            {
                System.out.println("Host is not reachable!");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
