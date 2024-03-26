package com.example.day02;

public class Book {
    public String title; // field title
    public int price; // field price

    //메서드
    // 접근제한자 리턴타입 메소드명(매개변수들..){ 구현 }
    public String getTitle(){
        return this.title; //this
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }
}
