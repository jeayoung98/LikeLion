package com.example;


import java.util.Scanner;
import java.util.Stack;


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
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;  // 스택이 비어 있으면 올바른 괄호 문자열이 아닙니다.
                } else {
                    stack.pop();  // 스택에서 여는 괄호를 제거합니다.
                }
            }
        }
        return stack.isEmpty();  // 스택이 비어 있어야 완전히 짝이 맞는 괄호 문자열입니다.
    }
}


//    public static boolean isVps(String str) {
//        while(true) {
//            String str1 = str.replace("()", "");
//            str = str1;
//            if(!str.contains("()")){
//                break;
//            }
//        }
//        return str.isEmpty();
//    }
//}
