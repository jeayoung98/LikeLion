package com.example.day12.practice;

public class Banker {
    private String name;
    private int id;

    public Banker(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void AccountOpening(Bank bank, String accountNumber, String ownerName, int initialBalance) {
        bank.openAccount(accountNumber, ownerName, initialBalance);
    }

    public void withdrawal(Account account, int amount) throws NotEnoughMoneyException {
        account.withdrawal(amount);
    }
}
