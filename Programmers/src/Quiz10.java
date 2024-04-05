import java.util.Arrays;

public class Quiz10 {
    public static void main(String[] args) {
        String s = "1 2 Z 3";
        int answer = 0;
        String[] numbers = s.split(" ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].equals("Z")) {
                numbers[i - 1] = "0";
                numbers[i] = "0";
            }
        }
        int[] intArray = new int[numbers.length]; // 정수 배열 생성

        // 문자열 배열을 정수 배열로 변환
        for (int i = 0; i < numbers.length; i++) {
            answer += Integer.parseInt(numbers[i]);
        }
        System.out.println(answer);
    }
}
