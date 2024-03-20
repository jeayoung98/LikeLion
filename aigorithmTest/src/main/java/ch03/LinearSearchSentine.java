package ch03;

import java.util.Scanner;

public class LinearSearchSentine {
    static int linearSearchSentine1(int[] arr, int size, int key) {
        int i = 0;
        arr[size] = key; // 보초 추가

        while (true) {
            if (arr[i] == key) {
                break;}
            i++;
        }return i == size ? -1 : i;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요소 개수 : ");
        int num = scanner.nextInt();
        int[] array = new int[num + 1]; // 요소 개수가 num +1 인 배열로, 마지막은 보초용

        for (int i = 0; i < num; i++) {
            System.out.println("array["+i+"]: ");
            array[i] = scanner.nextInt();
        }
        System.out.println("찾을 값 : ");
        int key = scanner.nextInt();

        int index = linearSearchSentine1(array, num, key); //배열 array에서 key를 검색

        if (index == -1) {
            System.out.println("찾는 값의 요소가 없습니다.");
        }
        else System.out.println("찾는 값은 arry[" +index + "]에 있습니다.");
    }
}
