package com.example.day12.practice;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final List<Account> accounts;
    private final List<Banker> bankers;


    public Bank() {
        this.accounts = new ArrayList<>();
        this.bankers = new ArrayList<>();
    }

    public void openAccount(String accountNumber, String ownerName, int initialBalance,boolean minus,String bankerName,int bankerId) {
        Account account = new Account(accountNumber, ownerName, initialBalance,minus);
        Banker banker = new Banker(bankerName, bankerId);
        accounts.add(account);
        bankers.add(banker);
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

    public boolean isMinus(int num) {
        return num == 1;
    }

}