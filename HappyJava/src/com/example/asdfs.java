package com.example;


import java.util.Scanner;

public class asdfs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < num; i++) {
            System.out.println(i);
            String str = sc.nextLine();
            System.out.println(str);
            if(isVps(str)){
                System.out.println("YES");
            }else System.out.println("NO");
        }
        sc.close();
    }
    public static boolean isVps(String str) {
        while(true) {
            String str1 = str.replace("()", "");
            str = str1;
            if(!str.contains("()")){
                break;
            }
        }
        return str.isEmpty();
    }
}
