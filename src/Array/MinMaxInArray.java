package Array;

public class MinMaxInArray {
    public static void main(String[] args) {
        int arr[] = {1,5,55,6,7,7,88,9,-1};
        int min = arr[0];
        int max = arr[0];
        for(int i: arr){
            if(i < min){
                min = i;
            }
            if(i > max){
                max = i;
            }
        }
        System.out.println("Minimum value in the array is: " + min);
        System.out.println("Maximum value in the array is: " + max);
    }
}
