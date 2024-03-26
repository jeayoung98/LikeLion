package com.example.day09;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
    private final int[] lottoArr = new int [46];
    private final int[] lottoNum = new int[6];
    private final int[] num = new int[6];

    public void lottoNum() {
        for (int i = 0; i < lottoArr.length; i++) {
            lottoArr[i] = i+1;
        }
        for (int i = 0; i < lottoArr.length; i++) {
            Random random = new Random();
            int num = random.nextInt(46)+1;
            lottoNum[i] = lottoArr[num];
            lottoNum[i] = 0;
            if (lottoArr[i] == 0) {
                lottoNum();
            }
        }
        Arrays.sort(lottoNum);

    }

    public void myNum() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < lottoNum.length; i++) {
            System.out.println("1부터 46까지 숫자를 입력하세요");
            num[i] = scanner.nextInt();
        }
        Arrays.sort(num);
    }

    public void lottoResult() {
        int count=0;
        for (int i = 0; i < 6; i++) {
            if (lottoNum[i] == num[i]) {
                count++;
            }
        }
        if (count < 4) System.out.println("낙첨 ㅠ");
        if (count == 4) System.out.println("4등!");
        if (count == 5) System.out.println("3등!");
        if (count == 6) System.out.println("2등!");

    }


}
