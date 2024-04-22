package com.example.day18;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client1 {
    public static void main(String[] args) {
        try (Socket socket = new Socket("127.0.0.1", 9999)) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

            String line = null;
            while ((line = keyboard.readLine()) != null) {
                writer.println(line);
                String echo = reader.readLine();
                System.out.println(echo);
            }
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
