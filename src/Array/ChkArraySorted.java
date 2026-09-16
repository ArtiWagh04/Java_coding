package Array;

public class ChkArraySorted {
    public static void main(String[] args) {
        int arr[] = {1,2,3,6,7,8,9};

        boolean flag = true;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                flag = false;
                break;
            }

        }

        if(flag){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }
}
