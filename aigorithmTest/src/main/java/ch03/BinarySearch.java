package ch03;

import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        Arrays.sort(array);

        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] == key) {
                return mid;
            } else if (array[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {5, 7, 9, 13, 15, 18, 19};
        int key = 7;

        int index = binarySearch(arr, key);
        if (index == -1)
            System.out.println("찾는값이 없습니다.");
         else
            System.out.println("찾는 값의 인덱스는 : " + index);
    }
}




