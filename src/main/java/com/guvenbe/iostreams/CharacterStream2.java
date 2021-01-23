package com.guvenbe.iostreams;

import java.io.*;

public class CharacterStream2 {
    public static void main(String[] args) {
        try {
            //Default is UTF8
            OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("example5.txt"));
            InputStreamReader in =new InputStreamReader(new FileInputStream("example5.txt"));
            System.out.println(out.getEncoding());
            out.write("READING USING InputStreamReader!!");
            out.flush();
            out.close();

            int data = in.read();
            while(data != -1){
                System.out.print((char)data);
                data=in.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
