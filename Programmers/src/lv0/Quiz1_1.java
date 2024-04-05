package lv0;

import java.util.Arrays;

public class Quiz1_1 { // 최빈값 지정하기
    public static void main(String[] args) {
        int answer = 0; // 최빈값
        int count1 = 1; // 현재 값 나온 횟수
        int count2 = 0; // 최대 횟수
        int[] array = {1, 2, 3, 4, 5};
        Arrays.sort(array);
        if(array.length == 1){ // 하나만 있으면 그 값 출력
            answer = array[0];
        }else if(array.length == 2){
            answer = -1;
        }else{
            for(int i =0; i<array.length-1;i++){
                if (array[i] == array[i+1]){
                    count1++; // 인덱스 i번째 i+1번째 같으면 count1 ++
                }else{
                    if(count1 > count2){
                        count2 = count1; // 최대횟수 갱신
                        count1 = 1; // count1 초기화
                        answer = array[i]; // 최빈값 지정
                    }else if(count2 > count1){
                        count1 = 1;
                    }else if (count2 == count1) {
                        count1 = 1;
                        answer = -1;
                    }
                }
            }
            if(count2 == count1){ // {1,1,2,2}처럼 반복문 끝나서 위에 else if 문이 안돌아갈떄 대비
                answer = -1;
            }else if(count1 > count2){
                answer = array[array.length-1];
            }
            System.out.println(answer);
        }
    }
}






