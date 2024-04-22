package com.example.day18;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {
        try(ServerSocket sever = new ServerSocket(9999)) {
            Socket socket = sever.accept();
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(),true);

            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println("서버로부터 받은 응답 메세지" + line);
                writer.println(line);
            }
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
