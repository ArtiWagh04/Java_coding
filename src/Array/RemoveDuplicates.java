package Array;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {1,2,-1,-1,2,3,5,2};
        HashSet<Integer> set = new HashSet<>();
        for(int i: arr){
            set.add(i);
        }
        System.out.println("Array after removing duplicates: " + set);
    }
}
