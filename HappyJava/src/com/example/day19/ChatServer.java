package com.example.day19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class ChatServer {
    public static void main(String[] args) {
        // 1. 서버소켓 생성
        try (ServerSocket server = new ServerSocket(9999);) {
            System.out.println("서버가 준비되었습니다.");
            Map<String,PrintWriter> allClients = new HashMap<>();
            while (true) {
                // 2. accept()를 통해서 소켓을 얻어옴 (여러명의 클라이언트와 접속할 수 있도록 구현)
                Socket socket = server.accept();
                new ChatThread(socket,allClients).start();
            }
            // Thread 이용
            // 여러명의 클라이언트의 정보를 기억할 공간

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class ChatThread extends Thread {
    private Socket socket;
    private String id;
    private Map<String,PrintWriter> allClients;
    private PrintWriter writer;
    private BufferedReader reader;


    public ChatThread(Socket socket, Map<String, PrintWriter> allClients) {
        // 생성자를 통해서 클라이언트 소켓을 얻어옴
        this.socket = socket;
        this.allClients = allClients;

        // 클라이언트가 생성될때 클라이언트로부터 아이디를 얻어오게 함
        // 각각 클라이언트와 통신 할 수 있는 통로 얻어옴
        try {
            writer = new PrintWriter(socket.getOutputStream(), true);
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            // 클라이언트가 접속하자마자 id 를 보낸다는 약속
            id = reader.readLine();
            broadcast(id + "님이 입장하셨습니다.");
            System.out.println("새로운 사용자 : " + id);

            // 동시에 일어날수도 있음
            synchronized (allClients) {
                allClients.put(id,writer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        // run
        // 연결된 클라이언트가 메세지를 전송하면, 그 메세지를 받아서 다른사용자들에게 보냄
        String line = null;
        try {
            while (((line = reader.readLine()) != null)) {
                if("/quit".equalsIgnoreCase(line)) break;
                if (line.startsWith("/r")) { // 귓속말 처리
                    whisper(line);
                    continue;
                }
                broadcast(id + " : " + line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            synchronized (allClients) {
                allClients.remove(id);
            }
            broadcast(id + "님이 퇴장하셨습니다.");

            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // 전체 사용자에게 알려주는 메서드
    public void broadcast(String msg) {
//        for (String id : allClients.keySet()) {
//            allClients.get(id).println(msg);
//        }
        synchronized (allClients) {
            Iterator<PrintWriter> it = allClients.values().iterator();
            while (it.hasNext()) {
                PrintWriter writer1 = it.next();
                try {
                    writer1.println(msg);
                } catch (Exception e) {
                    it.remove(); // broadcast 할 수 없는 사용자 제거
                    e.printStackTrace();
                }
            }
        }
    }

    public void whisper(String msg) {
        String[] whisper = new String[3];
        String[] msg1 = msg.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < msg1.length; i++) {
            if(i >= 2){
                sb.append(msg1[i]).append(" ");
                whisper[2] = sb.toString();
            }else whisper[i] = msg1[i];

        }
        if(whisper[2] == null){
            PrintWriter sender = allClients.get(this.id);
            sender.println("/r id 메세지 형식으로 입력해주세요");
        }
        else{
            String receiverId = whisper[1];
            SendWhisper(receiverId, id + "님의 귓속말 : " + whisper[2]);
        }
    }

    public void SendWhisper(String id, String msg) {
        PrintWriter receiver = allClients.get(id);
        if (receiver != null) {
            receiver.println(msg);
        } else {
            PrintWriter sender = allClients.get(this.id);
            sender.println(id + "님을 찾지못했습니다.");
        }
    }
}
