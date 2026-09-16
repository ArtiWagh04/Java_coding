package Array;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {1,5,515,6,7,7,88,9,-1};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i: arr){
            if(i> largest){
                secondLargest = largest;
                largest = i;
            }
            else if(i>secondLargest){
                secondLargest = i;
            }
        }
        System.out.println(largest + "----" + secondLargest);
    }
}
