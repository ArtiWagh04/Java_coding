package Array;

public class MaxSubArrSum {
    public static void main(String arg[]){
        int arr[] = {1,-4,-2, -3,7,4,-1, 5};
        int currentSum = arr[0];
        int maxSum = arr[0];
        for(int i=1; i<arr.length; i++){
            currentSum = Math.max(arr[i],(currentSum+arr[i]));
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println(maxSum);
    }
}
