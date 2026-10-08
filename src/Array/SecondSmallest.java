package Array;

public class SecondSmallest {
    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 55, -9, 56};

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i : arr) {
            if (i < smallest) {
                secondSmallest = smallest;
                smallest = i;
            } else if (i < secondSmallest) {
                smallest = i;
            }
        }
        System.out.println(smallest + "///" + secondSmallest);

    }
}