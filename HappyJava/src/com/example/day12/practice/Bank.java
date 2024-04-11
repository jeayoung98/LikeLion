package com.example.day12.practice;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private List<Account> accounts;

    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void openAccount(String accountNumber, String ownerName, int initialBalance) {
        Account account = new Account(accountNumber, ownerName, initialBalance);
        accounts.add(account);
        System.out.println("계좌가 개설되었습니다: " + accountNumber);
    }

    public Account getAccount(String accountNumber) throws AccountNotFoundException {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        throw new AccountNotFoundException("통장을 찾을 수 없습니다: " + accountNumber);
    }

    public String getName() {
        return name;
    }
}