package Array;

import java.util.HashSet;

public class Intersection {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int arr2[] = {2,3,4,5};
        HashSet<Integer> set = new HashSet<>();
        for(int i: arr){
            set.add(i);
        }
        for(int i=0; i<arr2.length; i++){
            if(set.contains(arr2[i])){
                System.out.print(arr2[i] + " ");
            }

        }

    }
}
