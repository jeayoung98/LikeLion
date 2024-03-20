package ch02;

public class TwoDimensionalArrayInitialization {
    public static void main(String[] args) {
        int[][] scores ={
                {90,80,70,60},
                {80,70,60,50},
                {70,60,50,40}
        };

        for (int i = 0; i < scores.length; i++) {
            System.out.println(i+1+"번 학생 점수 : ");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.println(scores[i][j]);
            }
            System.out.println();
        }
    }
}
