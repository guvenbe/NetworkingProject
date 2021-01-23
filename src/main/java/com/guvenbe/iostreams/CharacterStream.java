package com.guvenbe.iostreams;

import java.io.*;

public class CharacterStream {
    public static void main(String[] args) {
        try {
            //Default is UTF8
            OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("example4.txt"),"UTF16");
            InputStreamReader in =new InputStreamReader(new FileInputStream("example4.txt"));
            System.out.println(out.getEncoding());
            out.write("Hello Character Stream!!");
//            out.flush();
//            out.close();
            out.write("another string");
            out.flush();
            out.write("こんにちは");
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
