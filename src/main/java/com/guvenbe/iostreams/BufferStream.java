package com.guvenbe.iostreams;

import java.io.*;

public class BufferStream {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("example6.txt"), 1024);
            BufferedWriter writer = new BufferedWriter(new FileWriter("example7.txt"));

            String line =null;

            while((line = reader.readLine()) != null){
                writer.write(line);
                writer.newLine();
            }
            writer.close();
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
