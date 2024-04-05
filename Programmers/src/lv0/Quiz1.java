package lv0;

import java.util.Arrays;

public class Quiz1 { // 최빈값 지정하기
    public static void main(String[] args) {
        int[] array = {1,1,2,2,3,3,3};
        int answer = 0; // 초기값 -1로 설정
        int count1 = 1; // 현재 값 나온 횟수
        int count2 = 0; // 최대 횟수
        int Num = array[0]; // 현재 숫자

        Arrays.sort(array);

        for (int i = 1; i < array.length; i++) {
            if (array[i] == Num) { // 현재 숫자와 같으면 나온 횟수 증가
                count1++;
            } else {
                if (count1 > count2) { // 현재가 더 크면
                    count2 = count1;
                    answer = Num;// 최빈값 갱신
                } else if (count1 == count2) {
                    answer = -1;
                }
                Num = array[i];
                count1 = 1; //  초기화
            }
        }

        if (count1 > count2) { // 마지막 숫자가 최빈값일 경우
            answer = Num;
        } else if (count1 == count2) {
            answer = -1;
        }
        System.out.println(answer);
    }
}




