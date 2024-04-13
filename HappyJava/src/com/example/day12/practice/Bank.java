package com.example.day12.practice;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void openAccount(String accountNumber, String ownerName, int initialBalance) {
        Account account = new Account(accountNumber, ownerName, initialBalance);
        accounts.add(account);

        System.out.println("계좌가 개설되었습니다 : " + accountNumber + " || 예금주명 : " + ownerName + " || 잔액 : " + initialBalance);
    }

    public Account getAccount(String accountNumber) throws AccountNotFoundException {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        throw new AccountNotFoundException("통장을 찾을 수 없습니다: " + accountNumber);
    }

}