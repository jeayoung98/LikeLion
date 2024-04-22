package com.example.day18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoThreadServer extends Thread{
    public static void main(String[] args) {
        // 1. ServerSocket 생성 (1개만 있으면 됨)
        try(ServerSocket server = new ServerSocket(1234)) {
            while(true){
                Socket clients = server.accept(); // 클라이언트 수만큼 반복 !
                // 클라이언트마다 각자 실행할 수 있도록 만들어야됨 !
                EchoThread echoThread = new EchoThread(clients);
                echoThread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class EchoThread extends Thread {
    private Socket socket;
    EchoThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        System.out.println(socket.getInetAddress().getHostAddress() + "로부터 연결되었습니다.");

        try (PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println("클라이언트로부터 받은 메세지 : " + line);
                writer.println(line);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
