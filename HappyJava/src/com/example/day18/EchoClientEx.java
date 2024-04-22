package com.example.day18;

import java.io.*;
import java.net.Socket;

public class EchoClientEx {
    public static void main(String[] args) throws IOException {
        // 1. 소켓 생성
        Socket socket = new Socket("127.0.0.1", 9999);
        System.out.println(9999 + "포트와 연결되었습니다.");

        // 2. 데이터 읽고 쓰기
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        // 클라이언트가 키보드를 통해 입력하기 위한 통로
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        String line = null;
        while ((line = keyboard.readLine()) != null) {
            if (line.equalsIgnoreCase("quit")) {
                break;
            }
            // 서버에게 보냄
            writer.println(line);
            writer.flush();

            // 서버에서 받음
            String echo = reader.readLine();
            System.out.println("서버로부터 받은 응답 메세지 : " + echo);
        }

        // 3. 연결 종료
        writer.close();
        reader.close();
        keyboard.close();
        socket.close();
    }
}
