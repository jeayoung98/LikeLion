package lv0;

public class Quiz15 {
    public static void main(String[] args) {
        int[][] dots = {{0,1},{10,1},{10,3},{0,3}};
        int answer = 1;
        int max = dots[0][0];
        int min = dots[0][0];
        for(int i =1; i<4;i++){
            if(max < dots[i][0]){
                max = dots[i][0];
            }
            else if(min > dots[i][0]){
                min = dots[i][0];
            }
        }
        answer *= (max-min);

        max = dots[0][1];
        min = dots[0][1];
        for(int i =1; i<4;i++){
            if(max < dots[i][1]){
                max = dots[i][1];
            }
            else if(min > dots[i][1]){
                min = dots[i][1];
            }
        }answer *= (max-min);
        System.out.println(answer);
    }
}
