package com.example.day16;

import java.io.*;

public class ObjectStringEx {
    public static void main(String[] args) {

        //객체를 파일에 저장 !!
        Person person = new Person("jung", 27);
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Person.txt"));) {
            out.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Person readPerson = null;
        // 파일에서 객체를 읽어오기!!
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("Person.txt"))) {
            readPerson = (Person) in.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(readPerson);
        System.out.println(readPerson.getName());

        readPerson.setAge(28);
        System.out.println(readPerson.getAge());
    }



}
