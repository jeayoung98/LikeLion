package com.example.day18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
    public static void main(String[] args) throws Exception{
        try (Socket socket = new Socket(SERVER_ADDRESS,SERVER_PORT)){
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(),true);
            Scanner scanner = new Scanner(System.in);

            Thread listenerThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        String serverMessage;
                        while ((serverMessage = reader.readLine()) != null) {
                            if ("exit".equalsIgnoreCase(serverMessage.trim())) {
                                break;
                            }
                            System.out.println("서버 : " + serverMessage);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
            listenerThread.start();

            while (true) {
                System.out.println("메세지 입력 : ");
                String message = scanner.nextLine();
                if (message.trim().equalsIgnoreCase("exit")) {
                    writer.println("exit");
                    break;
                }
                writer.println(message);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static final String SERVER_ADDRESS = "127.0.0.1";
    private static final int SERVER_PORT = 12345;
}
