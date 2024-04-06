package lv0;

public class Quiz18 {
    public static void main(String[] args) {

        int a = 12;
        int b = 21;
        int answer = 0;
        int gcd1 = gcd(a, b);
        int remain = 0;
        int denom = b / gcd1;

        if(denom % 2 ==0){
            if(denom % 5 ==0){
                answer = 1;
            }
            else {
                answer = 2;
            }
        }else answer = 2;
        int c = (int)Math.pow(2,5);




        System.out.println(c);
    }
    public static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }
}

