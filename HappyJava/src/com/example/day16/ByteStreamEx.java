package com.example.day16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamEx {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("src/com/example/day16/ReadFile.java"); // 파일로 부터 바이트 단위
            out = new FileOutputStream("outputFile.txt");
            int c;
            while ((c = in.read())!= -1) { // 파일로부터 한 바이트를 읽음
                out.write(c); // 읽어온 바이트를 다른 파일에 씀
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
