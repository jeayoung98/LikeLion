package com.bank;

public class Banker {
    private String name;
    private int id;
    private int performance;


    public Banker(String name, int id) {
        this.name = name;
        this.id = id;
        this.performance = 0;
    }

    public void increasePerformance() {
        this.performance++;
    }

    public void AccountOpening(Bank bank, String accountNumber, String ownerName, int initialBalance,boolean minus,String bankerName,int bankerId) {
        bank.openAccount(accountNumber, ownerName, initialBalance,minus,bankerName,bankerId);
        increasePerformance();
    }

    public int getPerformance() {
        return performance;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
