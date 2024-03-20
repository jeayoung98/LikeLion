package ch02;

import java.util.Arrays;
import java.util.Scanner;

public class InvertArray2 {
    static void swap(int[] a, int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

    static int[] reverse(int[] a) {
        for (int i = 0; i < a.length/2; i++) {
            swap(a, i, a.length - i-1);
        }
        return a;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("배열의 갯수를 입력해주세요 : ");
        int[] array = new int[scanner.nextInt()];

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d 번의점수를 입력해주세요 : ", i + 1);
            array[i] = scanner.nextInt();
        }
//        System.out.println("역순정렬전 : " +Arrays.toString(array));

        System.out.println(Arrays.toString(reverse(array)));
    }
}
