import java.util.Arrays;

public class Quiz12 {
    public static void main(String[] args) {
        String my_string = "abc1Addfggg4556b";

        int n = 6;
        int k = 0;
        int size = my_string.length()/n;
        if(my_string.length() % n != 0){
            size +=1;
        }
        String[] answer = new String[size];
        String[] strArr = my_string.split("");
        for (int i = 0; i < answer.length; i++) {
            String str = "";
            for (int j = 0; j < n; j++) {
                if(j+k == strArr.length){
                    break;
                }
                str += strArr[j+k];
                answer[i] = str;
            }
            k+=n;
        }
        System.out.println(Arrays.toString(answer));

    }
}
