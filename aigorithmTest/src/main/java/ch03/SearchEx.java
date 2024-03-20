package ch03;

public class SearchEx {
    static int sequentialSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 33, 45, 2, 44};

       int index = sequentialSearch(arr, 33);

        if (index == -1)
            System.out.println("찾는 값이 없습니다.");
        else System.out.println("index = " + index);
    }
}

