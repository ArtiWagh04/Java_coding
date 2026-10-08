package Array;

public class AvgOfAll {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        int n = arr.length;

        int sum = n*(n+1)/2;
        int avg = sum/n;
        System.out.println("Average of all numbers in the array is: " + avg);
    }

}
