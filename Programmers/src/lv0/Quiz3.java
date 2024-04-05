package lv0;

import java.util.Arrays;

public class Quiz3 { // 연속된 수의 합
    public static void main(String[] args) {
        int total = 12;
        int num = 3;
        int rangeStart = total/num-num/2; // 범위 시작점

        int[] answer = new int[num];

        for (int i = rangeStart; i < rangeStart + num; i++) { // num 만큼의 수의 합이 total과 같은지 확인
            int sum = sum(i,i+num-1);
            if (sum == total) { // 맞으면
                for (int j = 0; j < answer.length; j++,i++) {
                    answer[j] = i; // rangeStart ~ rangeStart+num 까지 순서대로 배열 넣기
                }break;
            }
        }
        System.out.println(Arrays.toString(answer));
    }
    public static int sum(int num1, int num2) { // 시작점 부터 끝점까지 합
        int sum = 0;
        for (int i = num1; i <= num2; i++) {
            sum +=i;
        }return sum;
    }
}
