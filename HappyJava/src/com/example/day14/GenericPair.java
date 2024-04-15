package com.example.day14;

import com.example.day02.Book;
import com.example.day12.practice.Account;
import com.example.day12.practice.Bank;

import java.util.Arrays;

public class GenericPair<T1, T2> {
    private T1 first;
    private T2 second;

    public GenericPair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    public T1 getFirst() {
        return first;
    }

    public T2 getSecond() {
        return second;
    }

    public void setFirst(T1 first) {
        this.first = first;
    }

    public void setSecond(T2 second) {
        this.second = second;
    }

    public static void main(String[] args) {
        GenericPair<String, Integer> pair = new GenericPair<>("hello", 4);
        String first = pair.getFirst();
        int second = pair.getSecond();

        GenericPair<Account, Bank> pair2 = new GenericPair<>(new Account("33", "정재영", 333, true), new Bank());
        Account account = pair2.getFirst();
        Bank bank = pair2.getSecond();
    }
}


