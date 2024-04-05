package lv0;

public class Quiz8 {
    public static void main(String[] args) {
        StringBuilder answer = new StringBuilder();
        String my_string = "people";

        for (int i = 0; i < my_string.length(); i++) {
            char currentChar = my_string.charAt(i);
            // 현재 문자가 문자열에서 처음 등장하는 위치인지 확인
            if (my_string.indexOf(currentChar) == i) {
                // 처음 등장하는 문자인 경우에만 결과 문자열에 추가
                answer.append(currentChar);
            }
        }
        System.out.println(answer);
    }
}
