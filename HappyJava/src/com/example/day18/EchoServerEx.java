package com.example.day18;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServerEx {
    public static void main(String[] args) {
        // 1. ServerSocket 생성
        ServerSocket server = null;
        try {
            server = new ServerSocket(9999);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("서버가 준비되었습니다.");

        // 2. 클라이언트 연결 수락
        Socket socket = null; // 클라이언트 소켓 얻어옴
        try {
            socket = server.accept();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(socket.getInetAddress().getHostAddress() + "로 부터 연결되었습니다.");

        // 3. 데이터를 읽고 쓰기
        // 입력 종료
        // 클라이언트의 출력이 서버의 입력이 된다
//        socket.getOutputStream();  클라이언트 출력
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // 출력 종료
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String line = null;
        while (true) {
            try {
                if (!((line = reader.readLine()) != null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("클라이언트에서 받은 메세지 : " + line);

            // 클라이언트가 보낸 메세지를 그대로 다시 클라이언트에게 보낸다.
            writer.println(line);
            writer.flush();
        }

        writer.close();
        try {
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
