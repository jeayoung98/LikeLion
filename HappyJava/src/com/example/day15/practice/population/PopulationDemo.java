package com.example.day15.practice.population;
import java.util.Scanner;

public class PopulationDemo {
    //알맞게 구현해 주세요.

    public static void main(String[] args) {
        PopulationManager manager = new PopulationManager();
        Scanner scanner = new Scanner(System.in);

        manager.addOrUpdateCity("서울", 10000000);
        manager.addOrUpdateCity("부산", 3500000);

        while (true) {
            System.out.println("명령을 입력하세요 (추가/수정, 삭제, 조회, 전체 조회, 종료): ");
            String command = scanner.next();
            if (command.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            String city;
            switch (command) {
                case "추가/수정":
                    System.out.print("도시 이름을 입력하세요: ");
                    city = scanner.next();
                    System.out.print("인구를 입력하세요: ");
                    int population = scanner.nextInt();
                    manager.addOrUpdateCity(city, population);
                    break;
                case "삭제":
                    System.out.print("도시 이름을 입력하세요: ");
                    city = scanner.next();
                    manager.removeCity(city);
                    break;
                case "조회":
                    System.out.print("도시 이름을 입력하세요: ");
                    city = scanner.next();
                    manager.displayPopulation(city);
                    break;
                case "전체 조회":
                    manager.displayAll();
                    break;
                default:
                    System.out.println("알 수 없는 명령입니다.");
                    scanner.nextLine();
            }
        }
        scanner.close();
    }
}