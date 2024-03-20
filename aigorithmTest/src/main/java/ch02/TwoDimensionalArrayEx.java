package ch02;

public class TwoDimensionalArrayEx {
    public static void main(String[] args) {
        int[][] scores = new int[3][4];

        scores[0][0] = 90;
        scores[0][1] = 80;
        scores[0][2] = 70;
        scores[0][3] = 60;

        scores[1][0] = 80;
        scores[1][1] = 70;
        scores[1][2] = 60;
        scores[1][3] = 50;

        scores[2][0] = 70;
        scores[2][1] = 60;
        scores[2][2] = 50;
        scores[2][3] = 40;

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "번째 학생의 과목 점수");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.println(scores[i][j]);
            }
            System.out.println();
        }
    }
}
