package com.example.day16;

import java.io.*;

public class DataTypesIoEx {
    public static void main(String[] args) {
        // 입출력 되는 데이터는 모두 바이트거나 캐릭터로 전송되는것을
        // 자바의 데이터 타입으로 읽고 쓰고 싶다. // DataInputStream

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.bin"));
             DataInputStream dis = new DataInputStream(new FileInputStream("data.bin"))) {
            dos.writeInt(123);
            dos.writeDouble(123.45);
            dos.writeBoolean(true);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
