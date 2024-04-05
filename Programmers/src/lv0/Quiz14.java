package lv0;

import java.util.Arrays;

public class Quiz14 {
    public static void main(String[] args) {
        int[][] a = {{1,1},{2,1},{2,2},{1,2}};
        for (int i = 0; i < a.length; i++) {
            Arrays.sort(a[i]);
        }
        System.out.println(Arrays.toString(a[0]));
        System.out.println(a[0][0]);
    }
}
