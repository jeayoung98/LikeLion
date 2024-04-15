package lv0;

import java.util.Arrays;

public class Quiz24 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j != i) {
                    for (int k = 1; k <= 3; k++) {
                        if (k != i && k != j) {
                            System.out.println(i + " " + j + " " + k);
                            break;
                        }
                    }
                    break;
                }
            }
        }
    }
}
