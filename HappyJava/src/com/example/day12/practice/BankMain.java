package com.example.day12.practice;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("계좌 이름을 설정해주세요 :");
        String bankName = scanner.nextLine();
        Bank bank = new Bank(bankName);


        Banker banker = new Banker("은행원", 123);

        banker.AccountOpening(bank, "12345678", "나정재영", 1000);

        try {
            Account account = bank.getAccount("12345678");
            System.out.println("계좌번호: " + account.getAccountNumber());
            System.out.println("예금주: " + account.getOwnerName());
            System.out.println("잔액: " + account.getBalance());

            banker.withdrawal(account, 6000);
        } catch (AccountNotFoundException | NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
        }
    }
}

