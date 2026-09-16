package Array;

import java.util.HashMap;

public class frequencyOfEachElement {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6,7,8,9,1,2,3,4,2,2,3,3,4};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        System.out.println(map);
    }




}
