package ch06;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr ={64,33,67,22,6,88,5};
        System.out.println("원래 배열 : " + Arrays.toString(arr));
        System.out.println(Arrays.toString(swap(arr)));
    }

    static int[] swap(int[] a) {
        for (int i = 1; i <= a.length-1; i++) {
            int count = 0;
            if (a[i-1] > a[i]) {
                int temp;
                temp = a[i-1];
                a[i-1] = a[i];
                a[i] = temp;
                swap(a);
                }
            else {
                count++;
                if (count == a.length - 1) {
                    break;
                }
            }
        }return a;

    }
}
