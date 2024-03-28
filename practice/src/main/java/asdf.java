import java.util.Arrays;

public class asdf {
    public static void main(String[] args) {
        int[] array = {1,2,3,3,3,4};
        int answer = 0; // 최빈값
        int count1 = 1; // 현재 값 나온 횟수
        int count2 = 0; // 최대 횟수
        Arrays.sort(array);
        if(array.length == 1){
            answer = array[0];
        }else{
            for(int i =0; i<array.length-1;i++){
                if (array[i] == array[i+1]){
                    count1++; // 인덱스 i번째 i+1번째 같으면 count1 ++
                }else{
                    if(count1 > count2){
                        count2 = count1; // 최대횟수 갱신
                        count1 = 1; // count1 초기화
                        answer = array[i]; // 최반값 지정
                    }else if(count2 < count1){
                        count1 = 1;
                    }else if(count2 == count1){
                        answer = 1;
                    }
                }
            }

        }
        System.out.println(answer);

    }

}
