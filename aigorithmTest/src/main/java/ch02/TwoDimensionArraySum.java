package ch02;

public class TwoDimensionArraySum {
    public static void main(String[] args) {
        int[][] scores = {
                {90, 80, 70, 60},
                {80, 70, 60, 50},
                {70, 60, 50, 40}
        };
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "번 학생의 점수");
            int sum = 0;
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j] + " ");
                sum += scores[i][j];
            }
            System.out.println();
            System.out.println((i + 1) + "번 학생의 총점");
            System.out.println(sum);
            System.out.println((i + 1) + "번 학생의 평균");
            System.out.println(sum/ scores[i].length);
            System.out.println();
        }
    }
}
