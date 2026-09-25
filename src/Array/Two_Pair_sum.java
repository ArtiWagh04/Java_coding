package Array;

import java.util.HashSet;

public class Two_Pair_sum{
    public static void main(String[] args) {
        int arr[] = {1,2,3,-5,-7,1, 4};

        int target = 5;

        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<arr.length; i++){
            int compliment = target - arr[i];
            if(set.contains(compliment)){
                System.out.print(compliment+ "-" + arr[i]);
                System.out.println();
            }
            set.add(arr[i]);
        }

    }
}
