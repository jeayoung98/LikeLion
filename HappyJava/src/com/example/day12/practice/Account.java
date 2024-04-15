package com.example.day12.practice;

public class Account {
    private final String accountNumber;
    private final String ownerName;
    private int balance;
    private final boolean minus;



    public Account(String accountNumber, String ownerName, int initialBalance, boolean minus ) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = initialBalance;
        this.minus = minus;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println(amount + "원이 입금되었습니다. 현재 잔액: " + balance);
    }

    public void withdrawal(int amount) throws NotEnoughMoneyException {
        if (minus) {
            if (balance - amount < -3000000) {
                throw new NotEnoughMoneyException("잔액이 부족합니다.");
            } else {
                balance -= amount;
                System.out.println(amount + "원이 출금되었습니다. 현재 잔액: " + balance);
            }
        } else if (amount > balance) {
            throw new NotEnoughMoneyException("잔액이 부족합니다.");
        } else {
            balance -= amount;
            System.out.println(amount + "원이 출금되었습니다. 현재 잔액: " + balance);
        }
    }


}
