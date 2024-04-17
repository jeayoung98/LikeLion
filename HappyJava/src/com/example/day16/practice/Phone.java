package com.example.day16.practice;

import java.io.*;
import java.util.List;

public class Phone {
    public void savePhoneBook(List<HpInfo> phoneBook) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("phone.txt"))) {
            for (HpInfo info : phoneBook) {
                out.writeObject(info);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printPhoneBook() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("phone.txt"))) {
            while (true) {
                try {
                    HpInfo info = (HpInfo) in.readObject();
                    System.out.println(info);
                } catch (EOFException e) {
                    break;
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}



