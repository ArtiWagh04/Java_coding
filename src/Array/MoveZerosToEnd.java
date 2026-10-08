package Array;

public class MoveZerosToEnd {
    public static void main(String[] args) {

        int[] arr = {3,0, 1, 4, 2, 0, 0, 5, 0, 2, 8, 0};

        int j = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}