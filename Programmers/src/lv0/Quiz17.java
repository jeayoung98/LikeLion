package lv0;

public class Quiz17 {
    public static void main(String[] args) {
        int n = 15;
        int[] fuck3 = new int[100];
        int answer = n;

        int k = 0;
        for(int i = 1; i<=100; i++){
            int count = 0;
            if(i % 3 == 0){
                count++;
            }
            if(i % 10 ==3 || i / 10 == 3){
                count++;
            }
            if(i% 3 == 0 && i% 10 == 3){
                count--;
            }
            i +=count;
            fuck3[k] = count + i;
            k++;
        }

        answer = fuck3[n-1];
        System.out.println(answer);
    }
}
