package com.example.day18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("127.0.0.1", 1234)) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

            String line = null;
            while ((line = keyboard.readLine()) != null) {
                if ("quit".equalsIgnoreCase(line.trim())) {
                    break;
                }
                writer.println(line);
                String echo = reader.readLine();
                System.out.println("서버로부터 받은 응답 메세지 : " + echo);
            }
            reader.close();
            writer.close();
            keyboard.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}