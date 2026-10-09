package Array;

public class MaxDiff {
    public static void main(String[] args) {
        int arr[] = {1,23,4,5,671,8};
        int max = arr[0];
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("Max Diff Bet Two Elements : " + (max-min));
    }

}
