package com.guvenbe.iostreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutStream {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("example2.txt",true);
            char H ='h';
            fileOutputStream.write((char)H);

            String string = "Hello Java Network Programming";
            fileOutputStream.write(string.getBytes());
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
