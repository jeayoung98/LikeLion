package com.example.day16;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class WWWRead {
    public static void main(String[] args) throws Exception{
        URL url = new URL("https://m.sports.naver.com/game/2024041850048613053/preview");
        InputStream urlInput = url.openStream();

        // URL에서 한줄씩 입력 받아서 출력해보세요.

        BufferedReader reader = new BufferedReader(new InputStreamReader(urlInput));
        String msg = null;
        while ((msg = reader.readLine()) != null) {
            System.out.println(msg);
        }
        System.out.println(msg);
    }
}
