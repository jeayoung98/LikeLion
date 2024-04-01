import java.util.Arrays;

public class Quiz9 {
    public static void main(String[] args) {
        String my_string = "Bcad";
        String lowerStr = my_string.toLowerCase();
        char[] charArr = lowerStr.toCharArray();
        Arrays.sort(charArr);
        String answer = new String(charArr);
        System.out.println(answer);
    }
}
