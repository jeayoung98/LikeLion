package com.example.day12.practice;

import java.util.List;

public class Banker {
    private String name;
    private int id;
    private int performance;


    public Banker(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void AccountOpening(Bank bank, String accountNumber, String ownerName, int initialBalance,boolean minus,String bankerName,int bankerId) {
        bank.openAccount(accountNumber, ownerName, initialBalance,minus,bankerName,bankerId);
    }

    public void withdrawal(Account account, int amount) throws NotEnoughMoneyException {
        account.withdrawal(amount);
    }

    public int getPerformance() {
        return performance;
    }
}
