package com.example.day19;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPEchoServer {
    public static void main(String[] args) {
        // UDP 통신 DatagramSocket 생성
        try (DatagramSocket socket = new DatagramSocket(9999)) {
            while (true) {
                byte[] receiveData = new byte[1024];
                byte[] sendData;
                DatagramPacket receivepacket = new DatagramPacket(receiveData, receiveData.length);
                socket.receive(receivepacket);

                String message = new String(receivepacket.getData()).trim();

                InetAddress clientAddress = receivepacket.getAddress();
                int port = receivepacket.getPort();

                DatagramPacket sendPacket = new DatagramPacket(message.getBytes(),message.length(),clientAddress,port);
                socket.send(sendPacket);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}