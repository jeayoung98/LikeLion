package com.example.day12.practice;

import java.util.HashMap;
import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) throws AccountNotFoundException {
        HashMap<String, String> bankCodes = new HashMap<>();
        bankCodes.put("카카오", "3333");
        bankCodes.put("우리", "1002");
        bankCodes.put("신한", "110");

        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("진행하실 번호를 선택해주세요\n1. 통장 개설 || 2. 입출금 || 3. 통장 정보 || 4. 종료");
            int num = scanner.nextInt();
            scanner.nextLine();

            if (num == 1) {
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("은행원 이름을 입력해주세요");
                String bankerName = scanner1.nextLine();
                System.out.println("은행원 id를 입력해주세요");
                int bankerId = scanner1.nextInt();
                Banker banker = new Banker(bankerName, bankerId);
                System.out.print("은행 이름을 입력해주세요: ");
                String bankName = scanner.nextLine();
                if (!bankCodes.containsKey(bankName)) {
                    System.out.println("잘못된 은행 이름입니다.");
                    continue;
                }

                String accountNum = bankCodes.get(bankName) + ((int) (Math.random() * 1000000000));
                System.out.print("예금주 이름을 입력해주세요: ");
                String userName = scanner.nextLine();
                System.out.print("초기 자금을 입력해주세요: ");
                int initBal = scanner.nextInt();
                System.out.println("마이너스 통장 개설 여부를 선택해주세요\n개설하시려면 1번 아니면 2번을 눌려주세요");
                int minus = scanner.nextInt();
                scanner.nextLine();
                bank.openAccount(accountNum, userName, initBal,bank.isMinus(minus),bankerName,bankerId);
            } else if (num == 2) {

                System.out.println("1. 입금 || 2. 출금");
                int operation = scanner.nextInt();
                scanner.nextLine();

                System.out.println("계좌번호를 입력해주세요: ");
                String accountNum = scanner.nextLine();

                try {
                    Account account = bank.getAccount(accountNum);
                    System.out.println("계좌번호: " + account.getAccountNumber());
                    System.out.println("예금주: " + account.getOwnerName());
                    System.out.println("잔액: " + account.getBalance());

                    if (operation == 1) {
                        System.out.println("입금하실 금액을 입력하세요: ");
                        int depositNum = scanner.nextInt();
                        scanner.nextLine();
                        account.deposit(depositNum);
                    } else if (operation == 2) {
                        System.out.println("출금하실 금액을 입력하세요: ");
                        int withdrawalNum = scanner.nextInt();
                        scanner.nextLine();
                        account.withdrawal(withdrawalNum);
                    }
                } catch (AccountNotFoundException | NotEnoughMoneyException e) {
                    System.out.println(e.getMessage());
                }
            } else if (num == 3) {
                System.out.println("계좌번호를 입력해주세요: ");
                String accountNum = scanner.nextLine();
                try {
                    Account account = bank.getAccount(accountNum);
                    System.out.println("계좌번호: " + account.getAccountNumber());
                    System.out.println("예금주: " + account.getOwnerName());
                    System.out.println("잔액: " + account.getBalance());
                } catch (AccountNotFoundException e) {
                    System.out.println(e.getMessage());
                }
            } else if (num == 4) {
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
            }
        }
        scanner.close();
    }
}


