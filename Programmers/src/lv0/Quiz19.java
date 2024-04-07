package lv0;

import java.util.Arrays;

public class Quiz19 {
    public static void main(String[] args) {
        int a = 7;
        int b = 20;
        int answer = 0;

        int gcd1 = gcd(a, b);
        int denom = b / gcd1;

        while (denom % 2 == 0) {
            denom /= 2;
        }
        while (denom % 5 == 0) {
            denom /= 5;
        }
        if (denom == 1) {
            answer =  1;
        }
        answer = 2;

        System.out.println(answer);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
        //        if((a*(int)Math.pow(2,9)*(int)Math.pow(5,4))%b == 0){
//            answer = 1;
//        }else answer =2;
//        System.out.println(answer);
    }
}
