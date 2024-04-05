package lv0;

import java.util.Arrays;

public class Quiz11 {
    public static void main(String[] args) {
        int n = 1998;
        int[] answer = new int[(int)Math.sqrt(n)];
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if(n % i ==0){
                answer[count++] = i;
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        if(n>1){
            answer[count] = n;
        }

        answer = Arrays.copyOf(answer, count);
        System.out.println(Arrays.toString(answer));

    }
}
