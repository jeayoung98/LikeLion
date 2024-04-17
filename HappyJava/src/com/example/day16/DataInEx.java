package com.example.day16;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInEx {
    public static void main(String[] args) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"))) {
            System.out.println(dis.readBoolean());
            System.out.println(dis.readByte());
            System.out.println(dis.readChar());
            System.out.println(dis.readDouble());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
