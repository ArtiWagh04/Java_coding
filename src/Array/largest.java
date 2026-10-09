package Array;

public class largest {
    public static void main(String[] args) {
        int arr[] = {1,23,4,5,67,8};
        int largest = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
    }

        System.out.println("Largest Element in Array : " + largest);
}

}
