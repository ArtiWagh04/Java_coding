package Array;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5,-1};
        for (int i = 0, j = arr.length - 1; i < arr.length / 2 && j >= arr.length / 2; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.println("Reversed Array : ");
        for (int i : arr) {
            System.out.println(i);
        }

    }
}
