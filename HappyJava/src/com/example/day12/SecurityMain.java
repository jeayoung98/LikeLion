package com.example.day12;

public class SecurityMain {
    public static void main(String[] args) {
        String encryptionKey = SecurityConfig.getEncryptionKey();
        System.out.println("암호화 키: " + encryptionKey);
    }
}

