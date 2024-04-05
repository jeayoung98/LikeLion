package lv0;

import java.util.Arrays;

public class Quiz2 { // 분수 덧셈
    public static void main(String[] args) {
        int numer1 = 9;
        int numer2 = 2;
        int denom1 = 1;
        int denom2 = 3;
        int denom = LCD(denom1, denom2); // 분모
        int numer = LCD(denom1,denom2)/denom1*numer1+LCD(denom1,denom2)/denom2*numer2; // 분자
        int Num = numer/GCD(numer,denom);
        int Den = denom/GCD(numer,denom);
        int[] answer = new int[]{Num, Den};

        System.out.println(Arrays.toString(answer));

    }
    public static int GCD(int num1,int num2){ // 최대 공약수

        if (num1 % num2 == 0) {
            return num2;
        }

        return GCD(num2, num1 % num2);

    }
    public static int LCD(int num1, int num2){ // 최소 공배수
        return num1*num2/GCD(num1,num2);
    }

}






