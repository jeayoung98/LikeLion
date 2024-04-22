package com.example.day18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
    public static void main(String[] args) {
        try(ServerSocket server = new ServerSocket(9999)){
            Socket socket = server.accept();
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
             String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                writer.println(line);
            }
            reader.close();
            socket.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
