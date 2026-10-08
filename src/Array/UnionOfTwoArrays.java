package Array;

import java.util.*;

public class UnionOfTwoArrays {
    public static void main(String[] args) {

        int arr1[] = {1, 2, 4 , 6, 8, 3,5,7,9,0,0};
        int arr2[] = {1,3,5,7,9,0,0};
        int setSize = arr1.length + arr2.length;

        HashSet<Integer> set = new HashSet<>();
        for(int num: arr1){
            set.add(num);
        }

        for(int num: arr2){
            set.add(num);
        }

        System.out.println(set);



    }
}