package lv0;

import java.util.Arrays;

public class Quiz23 {
    public static void main(String[] args) {
        String[] quiz = {"3 - 4 = -3","5 + 6 = 11"};
        String[] answer = new String[quiz.length];

        for(int i = 0 ; i < quiz.length; i++) {
            // '+' 또는 '-' 또는 '='을 기준으로 분리
            String[] numArr = quiz[i].split("\\s");

            int num1 = Integer.parseInt(numArr[0]);
            int num2 = Integer.parseInt(numArr[2]);
            int result = Integer.parseInt(numArr[4]);

            String operator = numArr[1];

            // 연산 결과 검증
            if (operator.equals("+")) {
                answer[i] = (num1 + num2 == result) ? "O" : "X";
            } else {
                answer[i] = (num1 - num2 == result) ? "O" : "X";
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}
