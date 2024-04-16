package com.bank;

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
        Banker existingBanker = findBanker(bankerName, bankerId);
        if (existingBanker == null) {
            existingBanker = new Banker(bankerName, bankerId);
            bankers.add(existingBanker);
        }
        existingBanker.increasePerformance();
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
    public int getBankerPerformance(int bankerId) throws BankerNotFoundException {
        for (Banker banker : bankers) {
            if (banker.getId() == bankerId) {
                return banker.getPerformance();
            }
        }
        throw new BankerNotFoundException("은행원을 찾을 수 없습니다: " + bankerId);
    }

    private Banker findBanker(String name, int id) {
        for (Banker banker : bankers) {
            if (banker.getName().equals(name) && banker.getId() == id) {
                return banker;
            }
        }
        return null;
    }
//    public int performanceBonus(int bankerId) {
//
//        return getBankerPerformance(bankerId)*1000;
//    }



    public boolean isMinus(int num) {
        return num == 1;
    }
}