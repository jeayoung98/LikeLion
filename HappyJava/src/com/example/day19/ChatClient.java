package com.example.day19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {
    public static void main(String[] args) {
        // 아이디가 처음에 입력되게 하기 위해서 args[0] 에서 받아오는 것으로 구현
        if (args.length != 1) {
            System.out.println("사용법 : java ChatClient id");
            System.exit(1);
        }
        try (Socket socket = new Socket("localhost", 9999);
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in))) {

            // 접속되면 id를 서버에 보낸다.
            writer.println(args[0]);

            // 네트워크에서 입력된 내용을 담당하는 부분을 Thread 로
            new InputThread(socket, reader).start();

            // 키보드로부터 입력받은 내용을 서버에 보내는 코드
            String msg;
            while ((msg = keyboard.readLine()) != null) {
                writer.println(msg);
                if("/quit".equalsIgnoreCase(msg.trim())) break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

class InputThread extends Thread {
    private Socket socket;
    private BufferedReader reader;

    InputThread(Socket socket, BufferedReader reader) {
        this.socket = socket;
        this. reader = reader;
    }

    @Override
    public void run() {
        try {
            String msg;
            while ((msg = reader.readLine()) != null) {
                System.out.println(msg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
