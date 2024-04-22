package com.example.day18;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;

public class ChatServer {
    public static void main(String[] args) throws Exception{
        System.out.println("채팅 서버가 시작되었습니다.");
        try (ServerSocket server = new ServerSocket(PORT)){
            while (true) {
                new Handler(server.accept()).start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static final int PORT = 12345;
    private static Set<PrintWriter> allClients = new HashSet<>();

    private static class Handler extends Thread {
        private Socket socket;
        private PrintWriter writer;
        private BufferedReader reader;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try {
                writer = new PrintWriter(socket.getOutputStream(),true);
                reader = new BufferedReader((new InputStreamReader(socket.getInputStream())));

                synchronized (allClients) {
                    allClients.add(writer);
                }

                String input;
                while ((input = reader.readLine()) != null) {
                    if ("exit".equalsIgnoreCase(input.trim())) {
                        break;
                    }
                    synchronized (allClients) {
                        for (PrintWriter writer : allClients) {
                            writer.println(input);
                        }
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }finally {
                if (writer != null) {
                    synchronized (allClients) {
                        allClients.remove(writer);
                    }
                }
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

