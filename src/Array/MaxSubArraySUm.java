package Array;

public class MaxSubArraySUm {
    public static void main(String[] args) {
        int arr[] = {1,2,3,-5,-7,1, 7};

        int currentSum = 0;
        int maxSum = 0;
        for(int i=0; i<arr.length; i++){
            currentSum = Math.max(arr[i],(currentSum+arr[i]));
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println(maxSum);
    }


}
