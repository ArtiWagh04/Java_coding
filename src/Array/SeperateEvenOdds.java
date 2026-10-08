package Array;

import java.util.*;

public class SeperateEvenOdds {
    public static void main(String[] args) {

        int arr1[] = {1, 2, 4 , 6, 8, 3,5,7,9,0,0};

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int num: arr1){
            if(num%2 == 0){
                even.add(num);
            }
            else{
                odd.add(num);
            }
        }

        System.out.println(even + " ****** " + odd);

    }
}