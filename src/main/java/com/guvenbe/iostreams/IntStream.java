package com.guvenbe.iostreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IntStream {
    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("example1.txt");
            int data= inputStream.read();
            while (data!=-1){
                System.out.print((char)data);

                data=inputStream.read();
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
