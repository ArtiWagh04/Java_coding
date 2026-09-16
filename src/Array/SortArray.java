package Array;

import javax.swing.*;
import java.sql.SQLOutput;

public class SortArray {
    public static void main(String[] args) {
        int arr[] = {-1,5,1,3,2,5,6, 4};

        for(int i=0, j=i+1; i<arr.length-1 && j<arr.length; i++, j++){

            if(arr[i]> arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
        System.out.println("Sprted Array : ");
        for(int i: arr){
            System.out.println(i);
        }
    }
}
